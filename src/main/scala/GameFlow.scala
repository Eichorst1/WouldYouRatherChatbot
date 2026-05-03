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
