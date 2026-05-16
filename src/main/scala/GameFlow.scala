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
     //  user typed A or B but no question is active
     // safe fallback — return unchanged state, no crash

    case Some(question) =>
     val reaction =
        getChoiceReaction(choice, question)

      val currentCount =
        state.answerStats.getOrElse(choice, 0)
     // ↑ safe map lookup — if "A" key exists return its count, else 0

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
