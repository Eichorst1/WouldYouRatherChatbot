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

}
