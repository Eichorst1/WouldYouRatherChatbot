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
