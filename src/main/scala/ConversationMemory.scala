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
}
def detectRepeatedQuery(input: String,history: List[InteractionEntry]): Boolean = {
  history.exists(
    entry => entry.userInput == input
  )
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
