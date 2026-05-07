import scala.io.StdIn.readLine

object Main {

  def greetUser(): String = {
    val messages = List(
      """
        |╔══════════════════════════════════════╗
        |║   🎮 Would You Rather Chatbot! 🎮    ║
        |╚══════════════════════════════════════╝
        |
        | Ready to challenge your choices? Let's go!
        |
        | Here's what you can do:
        |  🎯  play / give me a question
        |  🎨  give me a funny / hard question
        |  🎲  recommend something
        |  🅰️  A  or  🅱️  B  — pick your answer
        |  📊  summary / topics / profile
        |  ❓  help
        |  🚪  exit
        |
        | Type anything to begin!
      """.stripMargin,

      """
        |╔══════════════════════════════════════╗
        |║   🤔 Would You Rather Chatbot! 🤔    ║
        |╚══════════════════════════════════════╝
        |
        | Welcome back! Tough choices await you...
        |
        | Here's what you can do:
        |  🎯  play / give me a question
        |  🎨  give me a funny / hard question
        |  🎲  recommend something
        |  🅰️  A  or  🅱️  B  — pick your answer
        |  📊  summary / topics / profile
        |  ❓  help
        |  🚪  exit
        |
        | Type anything to begin!
      """.stripMargin
    )

    val randomIndex = scala.util.Random.nextInt(messages.length)
    messages(randomIndex)
  }

  def parseInput(input: String): List[String] = {
    if (input.trim.isEmpty) {
      List.empty
    } else {
      val stopWords = Set(
        "an", "the", "me", "my", "i" ,
        "to", "give", "want", "can", "you", "please"
      )

      input
        .toLowerCase
        .trim
        .replaceAll("[^a-z0-9\\s]", " ")
        .split("\\s+")
        .toList
        .filter(_.nonEmpty)
        .filterNot(stopWords.contains)
    }
  }

  def detectIntent(tokens: List[String]): Intent = {

    def isCategory(word: String): Boolean = word match {
      case "funny" | "gaming" | "deep" | "moral" | "school" |
           "money" | "food" | "travel" | "fantasy" | "chaotic" |
           "relationships" | "daily" =>
        true

      case _ =>
        false
    }

    def isIntensity(word: String): Boolean = word match {
      case "easy" | "medium" | "hard" =>
        true

      case _ =>
        false
    }

    def isGreeting(word: String): Boolean = word match {
      case "hi" | "hello" | "hey" | "start" =>
        true

      case _ =>
        false
    }

    def isExit(word: String): Boolean = word match {
      case "exit" | "bye" | "quit" | "close" =>
        true

      case _ =>
        false
    }

    def isHelp(word: String): Boolean = word match {
      case "help" | "commands" | "how" =>
        true

      case _ =>
        false
    }

    def isQuestionRequest(word: String): Boolean = word match {
      case "play" | "question" | "ask" =>
        true

      case _ =>
        false
    }

    def isRecommendationRequest(word: String): Boolean = word match {
      case "recommend" | "suggest" | "surprise" =>
        true

      case _ =>
        false
    }

    def isPositiveConfirmation(word: String): Boolean = word match {
      case "yes" | "yeah" | "yep" | "sure" | "ok" | "okay" =>
        true

      case _ =>
        false
    }

    def isNegativeConfirmation(word: String): Boolean = word match {
      case "no" | "nope" | "nah" =>
        true

      case _ =>
        false
    }

    def isBadWord(word: String): Boolean = word match {
      case "stupid" | "idiot" | "shut" | "dumb" =>
        true

      case _ =>
        false
    }

    tokens match {

      case Nil =>
        UnknownIntent("")

      case words if words.exists(isBadWord) =>
        InappropriateInput(words.mkString(" "))

      case words if words.exists(isExit) =>
        ExitChat

      case words if words.exists(isHelp) =>
        Help

      case words if words.exists(word => word == "cancel" || word == "stop" || word == "nevermind") =>
        Cancel

      case words if words.exists(isPositiveConfirmation) =>
        Confirmation(true)

      case words if words.exists(isNegativeConfirmation) =>
        Confirmation(false)

      case words if words.exists(isGreeting) =>
        Greeting

      case words if words.contains("summary") || words.contains("summarize") =>
        ShowSummary

      case words if words.contains("topics") || words.contains("categories") =>
        ShowTopics

      case words if words.contains("profile") || words.contains("stats") =>
        ShowProfile

      case words if words.contains("a") || words.contains("first") =>
        AnswerChoice("A")

      case words if words.contains("b") || words.contains("second") =>
        AnswerChoice("B")

      case words if words.exists(isRecommendationRequest) =>
        RecommendQuestion

      case words if words.exists(isQuestionRequest) =>
        val category = words.find(isCategory)
        AskQuestion(category)

      case words =>
        words.find(isCategory) match {

          case Some(category) =>
            SetPreference("category", category)

          case None =>
            words.find(isIntensity) match {

              case Some(intensity) =>
                SetPreference("intensity", intensity)

              case None =>
                UnknownIntent(words.mkString(" "))
            }
        }
    }
  }

def handleUserInput(input: String, state: ConversationState): (String, ConversationState) = {
  val tokens = parseInput(input)
  val intent = detectIntent(tokens)
  val (response, updatedState) = generateResponse(intent, state)
  val finalState = ConversationMemory.logInteraction(input, response, intent, updatedState)
  (response, finalState)
}

def generateResponse(intent: Intent, state: ConversationState): (String, ConversationState) = {
  intent match {
    case Greeting =>
      ("Hello! Ready to play?", state)

    case AskQuestion(_) =>
      val question = GameFlow.chooseNextQuestion(QuestionBank.allQuestions, state.alreadyAsked)
      question match {
        case Some(q) => GameFlow.askQuestion(q, state)
        case None    => ("No more questions available.", state)
      }

    case AnswerChoice(choice) =>
      GameFlow.handleAnswer(choice, state)

    case ShowSummary =>
      val history = ConversationMemory.getConversationHistory(state)
      
      val summary = history.map(e => s"${e.sequenceNumber}: ${e.userInput} -> ${e.botResponse}").mkString("\n")
      (if (summary.isEmpty) "No conversation yet." else summary, state)

    case ShowTopics =>
      val topics = ConversationMemory.extractTopics(state.history)
      (if (topics.isEmpty) "No topics found." else topics.mkString(", "), state)
    
    case ShowProfile =>
      (GameFlow.getPlayerProfile(state), state)
    
    case Help =>
      (helpMessage(), state)

    case ExitChat =>
      ("Goodbye!", state)

    
    case SetPreference(key, value) =>
      val newState = RecommendationEngine.updatePreferences(state, key, value)
      val msg = RecommendationEngine.preferenceMessage(key, value)
      (msg, newState)

    
    case RecommendQuestion =>
      askRecommendedQuestion(state)

   
    case Cancel =>
      ("Cancelled.", state.copy(currentQuestion = None))

    
    case Confirmation(confirmed) =>
      (s"You said ${if (confirmed) "yes" else "no"}.", state)

    
    case UnknownIntent(input) =>
      (s"Sorry, I didn't understand '$input'. Type 'help'.", state)

    case InappropriateInput(_) =>
      ("Please keep the conversation respectful.", state)

    
    case _ =>
      ("I don't understand.", state)
  }
}

  
// Shows available commands to help the user
def helpMessage(): String =
  """
    |Available commands:
    |
    |hello
    |play
    |A / B
    |summary
    |topics
    |profile
    |recommend something
    |exit
    |
    |Type 'help' for assistance.
  """.stripMargin


// Message when input is not understood
def fallbackMessage(): String =
  """
    |I didn’t understand that command 😅
    |
    |Try:
    |hello
    |play
    |A or B
    |summary
    |topics
    |profile
    |recommend something
    |exit
    |
    |Type 'help' for all commands.
  """.stripMargin


// Gets a recommended question or fallback message
def askRecommendedQuestion(
    state: ConversationState
): (String, ConversationState) = {

  val questionOpt =
    RecommendationEngine.recommendOne(
      state.preferences,
      QuestionBank.allQuestions,
      state.alreadyAsked
    )

  questionOpt match {

    case Some(question) =>
      GameFlow.askQuestion(question, state)

    case None =>
      ("No recommended questions available right now.", state)
  }
}
def main(args: Array[String]): Unit = {
  println(greetUser())
  loop(ConversationMemory.initialState)
}

def loop(state: ConversationState): Unit = {
  val input = readLine("\nYou: ")

  val (response, newState) =
    handleUserInput(input, state)

  println(s"\nBot: $response")

  val intent =
    detectIntent(parseInput(input))

  if (intent != ExitChat) {
    loop(newState)
  }
}
}
