import java.time.LocalDateTime

object ConversationMemory {

  // This is the starting memory of the chatbot.
  // At the beginning, the bot has no history,
  // no preferences, no asked questions, and no active question.
  val initialState: ConversationState = ConversationState(
    history = List.empty,
    preferences = Map.empty,
    alreadyAsked = Set.empty,
    currentQuestion = None,
    answerStats = Map("A" -> 0, "B" -> 0),
    roundsPlayed = 0
  )

  def logInteraction(
      userInput: String,
      botResponse: String,
      intent: Intent,
      state: ConversationState
  ): ConversationState = {
    val entry = InteractionEntry(
      sequenceNumber = state.history.length + 1,
      userInput = userInput,
      botResponse = botResponse,
      detectedIntent = intent,
      topic = state.currentQuestion.map(_.category),
      mood = None,
      timestamp = LocalDateTime.now().toString
    )

    state.copy(history = state.history :+ entry)
  }

  def getConversationHistory(state: ConversationState): List[InteractionEntry] =
    state.history

  def getLastNInteractions(n: Int, state: ConversationState): List[InteractionEntry] =
    state.history.takeRight(n)

def detectRepeatedQuery(input: String, history: List[InteractionEntry]): Boolean = {
  val lowerInput = input.trim.toLowerCase
  history.exists(entry => entry.userInput.trim.toLowerCase == lowerInput)
}
def detectTopicInText(text: String): Option[String] = {
  val lower = text.toLowerCase
if (lower.contains("funny"))
    Some("funny")

  else if (lower.contains("gaming"))
    Some("gaming")

  else if (lower.contains("food"))
    Some("food")

  else if (lower.contains("school"))
    Some("school")

  else
    None
}

def extractTopics(history: List[InteractionEntry]): List[String] = {
  history.flatMap(entry => entry.topic)
}


  
// Returns most discussed topics in history
def getMostDiscussedTopics(history: List[InteractionEntry]): List[String] = {

  history
    .flatMap(entry => entry.topic)
    .groupBy(topic => topic)
    .map { case (topic, occurrences) =>
      (topic, occurrences.size)
    }
    .toList
    .sortBy { case (topic, count) => -count }
    .map { case (topic, count) => topic }
}

  """
List(
  InteractionEntry(topic = Some("funny")),
  InteractionEntry(topic = Some("deep")),
  InteractionEntry(topic = Some("funny")),
  InteractionEntry(topic = None),
  InteractionEntry(topic = Some("deep")),
  InteractionEntry(topic = Some("funny"))
)

after flatmap : List("funny", "deep", "funny", "deep", "funny")

after groupby : 

"funny" -> List("funny", "funny", "funny"),
"deep"  -> List("deep",  "deep")

.map { case (topic, occurrences) => (topic, occurrences.size) }

Map(
  "funny" -> 3,
  "deep"  -> 2
)

List(("funny", 3), ("deep", 2))

  """


// Detects user mood from conversation text
def getUserMood(history: List[InteractionEntry]): String = {

  val text =
    history.map(entry => entry.userInput.toLowerCase).mkString(" ")

  if (
    text.contains("love") ||
    text.contains("fun") ||
    text.contains("great") ||
    text.contains("awesome") ||
    text.contains("good")
  )
    "Positive 😊"

  else if (
    text.contains("bad") ||
    text.contains("boring") ||
    text.contains("hate") ||
    text.contains("annoying")
  )
    "Negative 😞"

  else
    "Neutral 😐"
}


// Formats topics for display
def formatTopics(history: List[InteractionEntry]): String = {

  val topics =
    getMostDiscussedTopics(history)

  if (topics.isEmpty)
    "No topics yet"

  else
    topics.mkString(", ")
}


// Creates a full conversation summary
def summarizeConversation(
    history: List[InteractionEntry],
    state: ConversationState
): String = {

  val mood =
    getUserMood(history)

  s"""
     |══════════════ SUMMARY ══════════════
     |
     |🔁 Rounds : ${state.roundsPlayed}
     |
     |📌 Topics : ${formatTopics(history)}
     |
     |😊 Mood   : $mood
     |
     |═════════════════════════════════════
     |""".stripMargin
} 

}
