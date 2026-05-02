object ConversationMemory {

  // This is the starting memory of the chatbot.
  // At the beginning, the bot has no history,
  // no preferences, no asked questions, and no active question.
  val initialState: ConversationState = ConversationState(
    history = List.empty,
    preferences = Map.empty,
    alreadyAsked = Set.empty,
    currentQuestion = None,
    answerStats = Map(
      "A" -> 0,
      "B" -> 0
    ),
    roundsPlayed = 0
  )

  // Skeleton for Day 2.
  // We are not writing the full logic yet.
  // Later, this function will save every user/bot exchange into history.
  def logInteraction(
                      userInput: String,
                      botResponse: String,
                      intent: Intent,
                      state: ConversationState
                    ): ConversationState = {
    state
  }

}
