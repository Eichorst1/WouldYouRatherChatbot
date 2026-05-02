// INTENT ADT
sealed trait Intent

// Called when the user greets the bot
// e.g. "hi", "hello"
case object Greeting extends Intent

// Called when the user wants a new question
// AskQuestion(None)          → no preference
// AskQuestion(Some("food"))  → with category preference
case class AskQuestion(category: Option[String] = None) extends Intent

// Called when the user picks A or B in a "Would You Rather" question
// e.g. "A", "I choose B"
case class AnswerChoice(choice: String) extends Intent

// Called when the user wants to update a setting in their profile
// e.g. SetPreference("category", "funny")
// e.g. SetPreference("intensity", "hard")
case class SetPreference(key: String, value: String) extends Intent

// Called when the user wants the bot to suggest a question automatically
// e.g. "recommend something", "surprise me"
case object RecommendQuestion extends Intent

// Called when the user wants to see a summary of their past answers
// e.g. "summary", "show my answers"
case object ShowSummary extends Intent

// Called when the user wants to see all available question topics
// e.g. "topics", "what topics are there?"
case object ShowTopics extends Intent

// Called when the user wants to view their profile and preferences
// e.g. "profile", "show my profile"
case object ShowProfile extends Intent

// Called when the user needs help understanding how the bot works
// e.g. "help", "how does this work?"
case object Help extends Intent

// Called when the user wants to cancel the current action
// e.g. "cancel", "never mind"
case object Cancel extends Intent

// Called when the bot asks for confirmation and the user responds yes or no
// Confirmation(true)  → user confirmed
// Confirmation(false) → user declined
case class Confirmation(confirmed: Boolean) extends Intent

// Called when the user wants to exit the chat
// e.g. "exit", "bye", "quit"
case object ExitChat extends Intent

// Called when the bot cannot understand the user's input
case class UnknownIntent(input: String) extends Intent

// Called when the user uses offensive, rude, or inappropriate language
case class InappropriateInput(input: String) extends Intent


//---------------------------------------------------------------------------------------------------------------------
// QUESTION MODEL

case class WyrQuestion(
                        id: Int,
                        prompt: String,
                        optionA: String,
                        optionB: String,
                        category: String,   // examples: "funny", "deep", "moral", "gaming", "food"
                        intensity: String,  // examples: "easy", "medium", "hard"
                        mood: String,       // examples: "silly", "serious", "chill", "fun", "chaotic"
                        tags: List[String]
                      )

// Example:
// WyrQuestion(
//   id = 1,
//   prompt = "Would you rather be super rich or super famous?",
//   optionA = "Be super rich",
//   optionB = "Be super famous",
//   category = "money",
//   intensity = "easy",
//   mood = "fun",
//   tags = List("money", "fame", "lifestyle")
// )

//---------------------------------------------------------------------------------------------------------------------
// CONVERSATION MEMORY MODELS

// Represents one exchange between the user and the chatbot.
case class InteractionEntry(
                             sequenceNumber: Int,
                             userInput: String,
                             botResponse: String,
                             detectedIntent: Intent,
                             topic: Option[String],
                             mood: Option[String],
                             timestamp: String
                           )

// This is the "memory" of the chatbot at any point in the conversation.
case class ConversationState(
                              history: List[InteractionEntry],
                              preferences: Map[String, String],
                              alreadyAsked: Set[Int],
                              currentQuestion: Option[WyrQuestion],
                              answerStats: Map[String, Int],
                              roundsPlayed: Int
                            )
