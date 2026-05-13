object GameFlow {

  def formatQuestion(question: WyrQuestion): String = {
    s"""
       |╔══════════════════════════════════════╗
       |║          WOULD YOU RATHER?           ║
       |╚══════════════════════════════════════╝
       |
       |${question.prompt}
       |
       |A) ${question.optionA}
       |B) ${question.optionB}
       |
       |Category : ${question.category}
       |Intensity: ${question.intensity}
       |Mood     : ${question.mood}
       |
       |Type A or B to answer.
     """.stripMargin
  }
  
def askQuestion(question: WyrQuestion, state: ConversationState): (String, ConversationState) = {
    val newState = state.copy(currentQuestion = Some(question))
    (formatQuestion(question), newState)
  }

  def chooseNextQuestion(data: List[WyrQuestion], alreadyAsked: Set[Int]): Option[WyrQuestion] = {
    data.find(question => !alreadyAsked.contains(question.id))
}
def getChoiceReaction(
    choice: String,
    question: WyrQuestion
): String = {

  choice match {

    case "A" =>
      s"You chose: ${question.optionA}"

    case "B" =>
      s"You chose: ${question.optionB}"

    case _ =>
      "Invalid choice."
  }
}

def handleAnswer(choice: String,state: ConversationState): (String, ConversationState) = {
   state.currentQuestion match {
     case None =>
     ("No active question.", state)

    case Some(question) =>
     val reaction =
        getChoiceReaction(choice, question)

      val currentCount =
        state.answerStats.getOrElse(choice, 0)

      val newStats =
        state.answerStats + (choice -> (currentCount + 1))

      val newState =
        state.copy(
          alreadyAsked =
            state.alreadyAsked + question.id,

          currentQuestion = None,

          answerStats = newStats,

          roundsPlayed = state.roundsPlayed + 1
        )

      (reaction, newState)
  }
}


// Updates answer statistics for A/B choices
def updateAnswerStats(
    stats: Map[String, Int],
    question: WyrQuestion,
    choice: String
): Map[String, Int] = {

  stats + (choice -> (stats.getOrElse(choice, 0) + 1))
}


// Adds question id to already asked set
def updateAlreadyAsked(
    alreadyAsked: Set[Int],
    question: WyrQuestion
): Set[Int] = {

  alreadyAsked + question.id
}


// Builds player profile summary
def getPlayerProfile(state: ConversationState): String = {

  val aCount = state.answerStats.getOrElse("A", 0)
  val bCount = state.answerStats.getOrElse("B", 0)

  val preferredCategory =
    state.preferences.getOrElse("category", "mixed")

  val level =
    state.roundsPlayed match {
      case n if n < 3  => "Beginner"
      case n if n < 10 => "Intermediate"
      case _           => "Advanced"
    }

  val personality =
    if (aCount > bCount) "You prefer A choices more."
    else if (bCount > aCount) "You prefer B choices more."
    else "You are balanced in your choices."

  s"""
     |================ PLAYER PROFILE ================
     |
     |🎮 Level: $level
     |🔁 Rounds Played: ${state.roundsPlayed}
     |
     |📊 A: $aCount | B: $bCount
     |
     |🎯 Category: $preferredCategory
     |
     |🧠 Personality: $personality
     |
     |================================================
     |""".stripMargin
}


// Suggests next action based on progress (simplified)
def suggestFollowUp(state: ConversationState): String = {

  state.roundsPlayed match {
    case n if n < 3 =>
      "Try answering more questions to unlock recommendations!"

    case n if n < 10 =>
      "Try asking for a recommended question or check your profile."

    case _ =>
      "You're advanced! Try 'recommend something' or explore topics."
  }
}
}
