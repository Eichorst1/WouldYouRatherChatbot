object QuestionBank {
  val allQuestions: List[WyrQuestion] = List(

    // ── FUNNY / SILLY ──────────────────────────────────────────────────────────
    WyrQuestion(1,  "Would you rather always sneeze glitter or always hiccup bubbles?",
      "Sneeze glitter", "Hiccup bubbles", "funny", "easy", "silly", List("random", "body", "glitter")),
    WyrQuestion(2,  "Would you rather have a laugh that sounds like a goat or a sneeze that sounds like a foghorn?",
      "Goat laugh", "Foghorn sneeze", "funny", "easy", "silly", List("laugh", "sound", "embarrassing")),
    WyrQuestion(3,  "Would you rather speak in rhymes for a day or speak only in questions?",
      "Speak in rhymes", "Only questions", "funny", "easy", "silly", List("speech", "language", "weird")),
    WyrQuestion(4,  "Would you rather have spaghetti for hair or meatballs for hands?",
      "Spaghetti hair", "Meatball hands", "funny", "easy", "silly", List("food", "body", "absurd")),
    WyrQuestion(5,  "Would you rather wear clown shoes every day or a clown wig every day?",
      "Clown shoes", "Clown wig", "funny", "easy", "silly", List("fashion", "clown", "weird")),
    WyrQuestion(6,  "Would you rather have to hop everywhere or walk only backwards?",
      "Hop everywhere", "Walk backwards", "funny", "easy", "silly", List("movement", "body", "awkward")),
    WyrQuestion(7,  "Would you rather sneeze every time someone says your name or yawn every time you see the color blue?",
      "Sneeze at your name", "Yawn at blue", "funny", "easy", "silly", List("reflex", "body", "weird")),
    WyrQuestion(8,  "Would you rather have a personal theme song that plays whenever you walk into a room or a dramatic sound effect every time you open a door?",
      "Personal theme song", "Door sound effect", "funny", "easy", "silly", List("sound", "dramatic", "funny")),
    WyrQuestion(9,  "Would you rather only be able to eat with your feet or only be able to drink through your nose?",
      "Eat with feet", "Drink through nose", "funny", "easy", "silly", List("eating", "body", "gross")),
    WyrQuestion(10, "Would you rather always have something stuck in your teeth or always have a hair in your mouth?",
      "Stuck in teeth", "Hair in mouth", "funny", "easy", "silly", List("body", "gross", "annoying")),
    WyrQuestion(11, "Would you rather narrate everything you do out loud or have a narrator follow you everywhere?",
      "Narrate yourself", "Personal narrator", "funny", "easy", "silly", List("speech", "social", "funny")),
    WyrQuestion(12, "Would you rather always smell like bacon or always smell like fresh laundry?",
      "Smell like bacon", "Smell like laundry", "funny", "easy", "silly", List("smell", "food", "body")),
    WyrQuestion(13, "Would you rather have arms as long as your legs or legs as short as your arms?",
      "Arms as long as legs", "Legs as short as arms", "funny", "easy", "silly", List("body", "proportions", "weird")),
    WyrQuestion(14, "Would you rather sneeze every time you lie or hiccup every time you are nervous?",
      "Sneeze when lying", "Hiccup when nervous", "funny", "easy", "silly", List("body", "reflex", "embarrassing")),
    WyrQuestion(15, "Would you rather have a tail like a dog that wags when you are happy or ears like a cat that flatten when you are mad?",
      "Wagging dog tail", "Flattening cat ears", "funny", "easy", "silly", List("body", "animals", "emotions")),
    WyrQuestion(16, "Would you rather only communicate through GIFs or through interpretive dance?",
      "GIFs only", "Interpretive dance only", "funny", "easy", "silly", List("communication", "funny", "social")),
    WyrQuestion(17, "Would you rather have a tiny elephant follow you everywhere or a giant hamster?",
      "Tiny elephant", "Giant hamster", "funny", "easy", "silly", List("animals", "pets", "weird")),
    WyrQuestion(18, "Would you rather live in a bouncy castle or a house made entirely of trampolines?",
      "Bouncy castle", "Trampoline house", "funny", "easy", "silly", List("home", "fun", "absurd")),
    WyrQuestion(19, "Would you rather wear a onesie to every job interview or show up in a superhero costume?",
      "Onesie", "Superhero costume", "funny", "easy", "silly", List("fashion", "interview", "embarrassing")),
    WyrQuestion(20, "Would you rather always leave a trail of glitter behind you or always have confetti fall around you?",
      "Glitter trail", "Confetti rain", "funny", "easy", "silly", List("sparkle", "fun", "messy")),
    WyrQuestion(21, "Would you rather have a dog that can talk but only says embarrassing things or a cat that judges you silently?",
      "Talking embarrassing dog", "Judging silent cat", "funny", "easy", "silly", List("pets", "animals", "embarrassing")),
    WyrQuestion(22, "Would you rather speak every language but only be able to whisper or speak only English but in a very loud opera voice?",
      "Whisper all languages", "Opera voice English only", "funny", "medium", "silly", List("language", "voice", "absurd")),
    WyrQuestion(23, "Would you rather have a remote control that pauses people or one that fast-forwards conversations?",
      "Pause people", "Fast-forward conversations", "funny", "medium", "silly", List("power", "social", "funny")),
    WyrQuestion(24, "Would you rather only eat foods that are the color orange or only eat foods that are white?",
      "Only orange foods", "Only white foods", "funny", "easy", "silly", List("food", "color", "diet")),
    WyrQuestion(25, "Would you rather fight one horse-sized duck or one hundred duck-sized horses?",
      "One horse-sized duck", "One hundred duck-sized horses", "chaotic", "hard", "silly", List("battle", "random", "classic")),

    // ── FUNNY / FUN ────────────────────────────────────────────────────────────
    WyrQuestion(26, "Would you rather have unlimited pizza for life or unlimited sushi for life?",
      "Unlimited pizza", "Unlimited sushi", "food", "easy", "fun", List("food", "pizza", "sushi")),
    WyrQuestion(27, "Would you rather win an Olympic gold medal or win a Nobel Prize?",
      "Olympic gold medal", "Nobel Prize", "daily", "medium", "fun", List("achievement", "sports", "science")),
    WyrQuestion(28, "Would you rather be the best player on a losing team or the worst player on a winning team?",
      "Best on losing team", "Worst on winning team", "daily", "medium", "fun", List("sports", "team", "winning")),
    WyrQuestion(29, "Would you rather explore the ocean floor or the surface of Mars?",
      "Ocean floor", "Surface of Mars", "fantasy", "medium", "fun", List("exploration", "space", "ocean")),
    WyrQuestion(30, "Would you rather have a rewind button for your life or a pause button?",
      "Rewind button", "Pause button", "fantasy", "medium", "fun", List("time", "power", "life")),
    WyrQuestion(31, "Would you rather have a personal chef or a personal driver?",
      "Personal chef", "Personal driver", "daily", "easy", "fun", List("luxury", "food", "lifestyle")),
    WyrQuestion(32, "Would you rather meet your favorite celebrity or meet the leader of your country?",
      "Favorite celebrity", "Country leader", "daily", "easy", "fun", List("celebrities", "social", "experience")),
    WyrQuestion(33, "Would you rather have free flights for life or free food for life?",
      "Free flights", "Free food", "daily", "easy", "fun", List("travel", "food", "luxury")),
    WyrQuestion(34, "Would you rather always have the best parking spot or always get a table at any restaurant immediately?",
      "Best parking spot", "Instant restaurant table", "daily", "easy", "fun", List("convenience", "daily", "luxury")),
    WyrQuestion(35, "Would you rather be a professional athlete or a world-famous musician?",
      "Professional athlete", "World-famous musician", "daily", "medium", "fun", List("career", "fame", "talent")),
    WyrQuestion(36, "Would you rather have an unlimited Netflix subscription or unlimited Spotify?",
      "Unlimited Netflix", "Unlimited Spotify", "daily", "easy", "fun", List("entertainment", "streaming", "media")),
    WyrQuestion(37, "Would you rather get paid to play video games or get paid to watch movies?",
      "Paid to play games", "Paid to watch movies", "gaming", "easy", "fun", List("gaming", "movies", "work")),
    WyrQuestion(38, "Would you rather have a photographic memory or be able to fall asleep anywhere instantly?",
      "Photographic memory", "Sleep anywhere instantly", "fantasy", "medium", "fun", List("memory", "sleep", "superpower")),
    WyrQuestion(39, "Would you rather only read books or only watch movies for the rest of your life?",
      "Only books", "Only movies", "daily", "medium", "fun", List("books", "movies", "entertainment")),
    WyrQuestion(40, "Would you rather win a cooking competition or a singing competition?",
      "Cooking competition", "Singing competition", "daily", "easy", "fun", List("cooking", "music", "competition")),
    WyrQuestion(41, "Would you rather have a treehouse or an underground bunker as a secret hideout?",
      "Treehouse", "Underground bunker", "daily", "easy", "fun", List("home", "adventure", "secret")),
    WyrQuestion(42, "Would you rather be famous for something embarrassing or anonymous for something amazing?",
      "Famous for embarrassing", "Anonymous for amazing", "daily", "hard", "fun", List("fame", "identity", "achievement")),
    WyrQuestion(43, "Would you rather know every cheat code to every video game or master one real-life skill instantly?",
      "All cheat codes", "Master real skill", "gaming", "medium", "fun", List("gaming", "skill", "life")),
    WyrQuestion(44, "Would you rather visit every country in the world or visit the moon once?",
      "Visit every country", "Visit the moon", "travel", "hard", "fun", List("travel", "space", "exploration")),
    WyrQuestion(45, "Would you rather live without the internet for a year or live without music for a year?",
      "No internet for a year", "No music for a year", "daily", "hard", "fun", List("technology", "music", "challenge")),
    WyrQuestion(46, "Would you rather have a robot do all your chores or a robot that gives you massages on demand?",
      "Robot does chores", "Robot masseuse", "daily", "easy", "fun", List("robot", "technology", "comfort")),
    WyrQuestion(47, "Would you rather speak to animals or speak every human language?",
      "Speak to animals", "Speak every language", "fantasy", "medium", "fun", List("language", "animals", "power")),
    WyrQuestion(48, "Would you rather go back in time 100 years or forward 100 years?",
      "Back 100 years", "Forward 100 years", "fantasy", "medium", "fun", List("time", "history", "future")),
    WyrQuestion(49, "Would you rather live in a penthouse in a busy city or a cabin in the mountains?",
      "City penthouse", "Mountain cabin", "travel", "easy", "fun", List("home", "city", "nature")),
    WyrQuestion(50, "Would you rather always know when someone is lying or always be believed no matter what you say?",
      "Detect lies", "Always believed", "fantasy", "hard", "fun", List("power", "truth", "social")),

    // ── DEEP / SERIOUS ─────────────────────────────────────────────────────────
    WyrQuestion(51, "Would you rather know the exact date of your death or know the exact cause?",
      "Know the date", "Know the cause", "deep", "hard", "serious", List("death", "life", "knowledge")),
    WyrQuestion(52, "Would you rather have one true best friend or many casual friends?",
      "One best friend", "Many casual friends", "relationships", "medium", "serious", List("friendship", "social", "life")),
    WyrQuestion(53, "Would you rather be remembered for 1000 years but hated or forgotten in 10 years but loved?",
      "Remembered but hated", "Forgotten but loved", "deep", "hard", "serious", List("legacy", "love", "memory")),
    WyrQuestion(54, "Would you rather have a long average life or a short extraordinary life?",
      "Long average life", "Short extraordinary life", "deep", "hard", "serious", List("life", "meaning", "time")),
    WyrQuestion(55, "Would you rather know all the answers or always ask the right questions?",
      "Know all answers", "Ask right questions", "deep", "hard", "serious", List("knowledge", "wisdom", "curiosity")),
    WyrQuestion(56, "Would you rather be deeply happy but poor or deeply sad but wealthy?",
      "Happy and poor", "Sad and wealthy", "deep", "hard", "serious", List("happiness", "money", "life")),
    WyrQuestion(57, "Would you rather lose all your memories from the past 5 years or lose all your close friendships?",
      "Lose 5 years of memories", "Lose all friendships", "deep", "hard", "serious", List("memory", "friendship", "loss")),
    WyrQuestion(58, "Would you rather always have to say what you are thinking or never be able to speak again?",
      "Always say your thoughts", "Never speak again", "deep", "hard", "serious", List("speech", "thoughts", "honesty")),
    WyrQuestion(59, "Would you rather live in a world with no art or a world with no science?",
      "No art", "No science", "deep", "hard", "serious", List("art", "science", "society")),
    WyrQuestion(60, "Would you rather know every language but lose your native tongue or speak only your native language forever?",
      "Know all languages, lose native", "Only native language", "deep", "hard", "serious", List("language", "identity", "culture")),
    WyrQuestion(61, "Would you rather live with no regrets or have the ability to undo one mistake?",
      "No regrets", "Undo one mistake", "deep", "hard", "serious", List("life", "regret", "mistakes")),
    WyrQuestion(62, "Would you rather be the most intelligent person alive but lonely or average intelligence but surrounded by love?",
      "Most intelligent but lonely", "Average but loved", "deep", "hard", "serious", List("intelligence", "love", "happiness")),
    WyrQuestion(63, "Would you rather always feel fulfilled but never feel excited or always feel excited but never fulfilled?",
      "Always fulfilled, never excited", "Always excited, never fulfilled", "deep", "hard", "serious", List("emotions", "meaning", "life")),
    WyrQuestion(64, "Would you rather know you are right but have no one believe you or be wrong but have everyone believe you?",
      "Right but not believed", "Wrong but believed", "deep", "hard", "serious", List("truth", "perception", "social")),
    WyrQuestion(65, "Would you rather live a life of meaning or a life of comfort?",
      "Life of meaning", "Life of comfort", "deep", "hard", "serious", List("meaning", "comfort", "purpose")),
    WyrQuestion(66, "Would you rather be stuck in the past or obsessed with the future?",
      "Stuck in the past", "Obsessed with future", "deep", "medium", "serious", List("time", "mindset", "life")),
    WyrQuestion(67, "Would you rather fail publicly and learn greatly or succeed quietly and learn nothing?",
      "Fail publicly, learn greatly", "Succeed quietly, learn nothing", "deep", "hard", "serious", List("failure", "growth", "success")),
    WyrQuestion(68, "Would you rather lose your sense of taste or your sense of smell?",
      "Lose taste", "Lose smell", "daily", "medium", "serious", List("senses", "food", "body")),
    WyrQuestion(69, "Would you rather have everyone always agree with you or always disagree with you?",
      "Everyone agrees", "Everyone disagrees", "deep", "hard", "serious", List("opinion", "social", "identity")),
    WyrQuestion(70, "Would you rather know the secrets of the universe or the secrets of your own mind?",
      "Secrets of universe", "Secrets of your mind", "deep", "hard", "serious", List("knowledge", "self", "universe")),
    WyrQuestion(71, "Would you rather lose the ability to feel love or lose the ability to feel pain?",
      "Lose love", "Lose pain", "deep", "hard", "serious", List("emotions", "love", "pain")),
    WyrQuestion(72, "Would you rather give up social media or give up watching any video content?",
      "Give up social media", "Give up video content", "daily", "medium", "serious", List("technology", "media", "habits")),
    WyrQuestion(73, "Would you rather be able to stop time but age normally or age very slowly but time moves normally?",
      "Stop time, age normally", "Age slowly, time normal", "fantasy", "hard", "serious", List("time", "aging", "power")),
    WyrQuestion(74, "Would you rather be invisible for a day or fly for a day?",
      "Invisible for a day", "Fly for a day", "fantasy", "easy", "serious", List("superpower", "freedom", "adventure")),
    WyrQuestion(75, "Would you rather always be a student or always be a teacher?",
      "Always a student", "Always a teacher", "school", "medium", "serious", List("learning", "education", "purpose")),

    // ── MORAL / SERIOUS ────────────────────────────────────────────────────────
    WyrQuestion(76, "Would you rather save one person you love or save five strangers?",
      "Save the one you love", "Save five strangers", "moral", "hard", "serious", List("ethics", "love", "sacrifice")),
    WyrQuestion(77, "Would you rather steal food to feed a starving child or let the child go hungry to follow the law?",
      "Steal to feed child", "Follow the law", "moral", "hard", "serious", List("ethics", "law", "compassion")),
    WyrQuestion(78, "Would you rather lie to protect a friend's feelings or tell a painful truth?",
      "Lie to protect them", "Tell the truth", "moral", "medium", "serious", List("honesty", "friendship", "ethics")),
    WyrQuestion(79, "Would you rather report a crime committed by your best friend or stay silent to protect them?",
      "Report the crime", "Stay silent", "moral", "hard", "serious", List("loyalty", "justice", "friendship")),
    WyrQuestion(80, "Would you rather be judged for your intentions or for your actions?",
      "Judged by intentions", "Judged by actions", "moral", "hard", "serious", List("ethics", "judgment", "actions")),
    WyrQuestion(81, "Would you rather betray a secret to prevent a small harm or keep the secret and allow the harm?",
      "Betray secret, prevent harm", "Keep secret, allow harm", "moral", "hard", "serious", List("trust", "harm", "ethics")),
    WyrQuestion(82, "Would you rather always be morally right but unpopular or morally wrong but universally liked?",
      "Morally right, unpopular", "Morally wrong, liked", "moral", "hard", "serious", List("ethics", "popularity", "values")),
    WyrQuestion(83, "Would you rather give away half your wealth to charity or spend it all on your family?",
      "Give to charity", "Spend on family", "moral", "hard", "serious", List("money", "charity", "family")),
    WyrQuestion(84, "Would you rather take credit for someone else's great idea or give away credit for your own?",
      "Take credit unfairly", "Give away your credit", "moral", "hard", "serious", List("honesty", "credit", "ethics")),
    WyrQuestion(85, "Would you rather witness an injustice and stay silent or speak up and face consequences?",
      "Stay silent", "Speak up", "moral", "hard", "serious", List("justice", "courage", "ethics")),
    WyrQuestion(86, "Would you rather do the right thing when no one is watching or only when people see you?",
      "Right when no one watches", "Right when people see", "moral", "medium", "serious", List("integrity", "ethics", "character")),
    WyrQuestion(87, "Would you rather break a small law to do a great good or follow all laws even when they cause harm?",
      "Break law for good", "Always follow law", "moral", "hard", "serious", List("law", "good", "ethics")),
    WyrQuestion(88, "Would you rather always tell the truth or always know the truth?",
      "Always tell the truth", "Always know the truth", "moral", "medium", "serious", List("truth", "honesty", "values")),
    WyrQuestion(89, "Would you rather win every argument but lose friends or lose arguments but keep peace?",
      "Win every argument", "Keep peace", "moral", "hard", "serious", List("ego", "friends", "values")),
    WyrQuestion(90, "Would you rather sacrifice your ambition to save a stranger's life or keep your ambition knowing a stranger will suffer?",
      "Sacrifice ambition", "Keep ambition", "moral", "hard", "serious", List("ethics", "sacrifice", "ambition")),

    // ── FANTASY / FUN ──────────────────────────────────────────────────────────
    WyrQuestion(91,  "Would you rather have the ability to read minds or control minds?",
      "Read minds", "Control minds", "fantasy", "hard", "fun", List("superpower", "mind", "control")),
    WyrQuestion(92,  "Would you rather teleport anywhere or time-travel to any era?",
      "Teleport anywhere", "Time-travel any era", "fantasy", "medium", "fun", List("power", "travel", "time")),
    WyrQuestion(93,  "Would you rather have the strength of 100 people or the speed of 100 people?",
      "Strength of 100", "Speed of 100", "fantasy", "medium", "fun", List("superpower", "strength", "speed")),
    WyrQuestion(94,  "Would you rather breathe underwater or survive in outer space without equipment?",
      "Breathe underwater", "Survive in space", "fantasy", "medium", "fun", List("superpower", "space", "ocean")),
    WyrQuestion(95,  "Would you rather turn invisible at will or fly at will?",
      "Turn invisible", "Fly", "fantasy", "easy", "fun", List("superpower", "classic", "power")),
    WyrQuestion(96,  "Would you rather have a dragon as a pet or a phoenix?",
      "Pet dragon", "Pet phoenix", "fantasy", "easy", "fun", List("mythical", "pets", "fantasy")),
    WyrQuestion(97,  "Would you rather live in a world of magic or a world of advanced technology?",
      "World of magic", "World of technology", "fantasy", "medium", "fun", List("magic", "technology", "world")),
    WyrQuestion(98,  "Would you rather have the ability to heal others instantly or heal yourself instantly?",
      "Heal others", "Heal yourself", "fantasy", "hard", "fun", List("healing", "superpower", "choice")),
    WyrQuestion(99,  "Would you rather be a wizard or a superhero?",
      "Wizard", "Superhero", "fantasy", "easy", "fun", List("wizard", "superhero", "power")),
    WyrQuestion(100, "Would you rather live underwater in a high-tech city or in a floating city above the clouds?",
      "Underwater city", "Floating city above clouds", "fantasy", "medium", "fun", List("city", "future", "fantasy")),
    WyrQuestion(101, "Would you rather shrink to the size of an ant or grow to the size of a building?",
      "Shrink to ant size", "Grow to building size", "fantasy", "medium", "fun", List("size", "superpower", "strange")),
    WyrQuestion(102, "Would you rather never need sleep or never need to eat?",
      "Never need sleep", "Never need to eat", "fantasy", "medium", "fun", List("biology", "superpower", "time")),
    WyrQuestion(103, "Would you rather be immune to all diseases or be immune to aging?",
      "Immune to diseases", "Immune to aging", "fantasy", "hard", "fun", List("health", "immortality", "superpower")),
    WyrQuestion(104, "Would you rather have a talking sword that gives advice or a magic backpack that always has what you need?",
      "Talking sword", "Magic backpack", "fantasy", "easy", "fun", List("magic", "adventure", "items")),
    WyrQuestion(105, "Would you rather live in a video game world or a movie world?",
      "Video game world", "Movie world", "fantasy", "easy", "fun", List("gaming", "movies", "fantasy")),
    WyrQuestion(106, "Would you rather control fire or control water?",
      "Control fire", "Control water", "fantasy", "easy", "fun", List("elements", "power", "nature")),
    WyrQuestion(107, "Would you rather live as a vampire or a werewolf?",
      "Vampire", "Werewolf", "fantasy", "easy", "fun", List("monster", "mythical", "power")),
    WyrQuestion(108, "Would you rather have access to any library ever built or any laboratory ever built?",
      "Any library", "Any laboratory", "fantasy", "medium", "fun", List("knowledge", "science", "power")),
    WyrQuestion(109, "Would you rather see 10 minutes into your own future or 10 minutes into anyone else's future?",
      "See your own future", "See others future", "fantasy", "hard", "fun", List("future", "power", "choice")),
    WyrQuestion(110, "Would you rather copy any skill by observing it once or invent any skill yourself?",
      "Copy any skill once", "Invent skills yourself", "fantasy", "hard", "fun", List("skill", "superpower", "learning")),

    // ── GAMING / FUN ───────────────────────────────────────────────────────────
    WyrQuestion(111, "Would you rather be the best player in the world at one game or be good at every game?",
      "Best at one game", "Good at every game", "gaming", "medium", "fun", List("gaming", "skill", "competition")),
    WyrQuestion(112, "Would you rather play as a villain or a hero in every game?",
      "Always villain", "Always hero", "gaming", "easy", "fun", List("gaming", "role", "morality")),
    WyrQuestion(113, "Would you rather have unlimited in-game currency or unlimited real-world currency?",
      "Unlimited in-game currency", "Unlimited real-world currency", "gaming", "easy", "fun", List("gaming", "money", "fun")),
    WyrQuestion(114, "Would you rather live inside a Minecraft world or a GTA world?",
      "Live in Minecraft", "Live in GTA", "gaming", "easy", "fun", List("gaming", "worlds", "adventure")),
    WyrQuestion(115, "Would you rather play games with terrible graphics but amazing story or perfect graphics but no story?",
      "Terrible graphics, great story", "Perfect graphics, no story", "gaming", "medium", "fun", List("gaming", "graphics", "story")),
    WyrQuestion(116, "Would you rather be a professional esports player or a famous game developer?",
      "Pro esports player", "Famous game developer", "gaming", "medium", "fun", List("gaming", "career", "esports")),
    WyrQuestion(117, "Would you rather win every multiplayer match or never lose a boss fight?",
      "Win every multiplayer match", "Never lose a boss fight", "gaming", "medium", "fun", List("gaming", "winning", "challenge")),
    WyrQuestion(118, "Would you rather have perfect aim in every game or perfect reflexes in real life?",
      "Perfect aim in games", "Perfect reflexes in real life", "gaming", "easy", "fun", List("skill", "games", "reaction")),
    WyrQuestion(119, "Would you rather play every game on max difficulty or lose all save files every month?",
      "Max difficulty forever", "Lose save files every month", "gaming", "hard", "chaotic", List("challenge", "risk", "games")),
    WyrQuestion(120, "Would you rather discover an easter egg that changes the ending of a game or find a secret level no one has ever seen?",
      "Easter egg that changes ending", "Secret level no one found", "gaming", "easy", "fun", List("gaming", "secrets", "discovery")),
    WyrQuestion(121, "Would you rather have infinite health but low damage or one-hit kill but one HP?",
      "Infinite health, low damage", "One-hit kill, one HP", "gaming", "medium", "chill", List("risk", "strategy", "games")),
    WyrQuestion(122, "Would you rather have the reactions of a pro gamer or the game sense of a pro gamer?",
      "Pro reactions", "Pro game sense", "gaming", "medium", "fun", List("gaming", "skill", "esports")),
    WyrQuestion(123, "Would you rather get every achievement in a game automatically or earn them all the hard way?",
      "Achievements automatically", "Earn them the hard way", "gaming", "medium", "fun", List("gaming", "achievements", "challenge")),
    WyrQuestion(124, "Would you rather have perfect aim but terrible movement or perfect movement but terrible aim?",
      "Perfect aim, terrible movement", "Perfect movement, terrible aim", "gaming", "medium", "fun", List("gaming", "skill", "balance")),
    WyrQuestion(125, "Would you rather speak only in movie quotes or sing every sentence you say?",
      "Speak only in movie quotes", "Sing every sentence", "funny", "hard", "chaotic", List("awkward", "social", "chaos")),

    // ── TRAVEL / CHILL ─────────────────────────────────────────────────────────
    WyrQuestion(126, "Would you rather travel the world alone for a year or stay home with your closest friends?",
      "Travel alone a year", "Stay with close friends", "travel", "hard", "chill", List("travel", "friendship", "adventure")),
    WyrQuestion(127, "Would you rather live in a beach town or a mountain village?",
      "Beach town", "Mountain village", "travel", "easy", "chill", List("nature", "home", "lifestyle")),
    WyrQuestion(128, "Would you rather visit Paris or Tokyo?",
      "Paris", "Tokyo", "travel", "easy", "chill", List("cities", "culture", "travel")),
    WyrQuestion(129, "Would you rather go on a safari in Africa or dive in the Great Barrier Reef?",
      "Safari in Africa", "Dive in Great Barrier Reef", "travel", "easy", "chill", List("adventure", "animals", "nature")),
    WyrQuestion(130, "Would you rather backpack through Europe or road-trip across America?",
      "Backpack Europe", "Road-trip America", "travel", "easy", "chill", List("travel", "adventure", "exploration")),
    WyrQuestion(131, "Would you rather live in a country where it is always summer or always winter?",
      "Always summer", "Always winter", "travel", "easy", "chill", List("weather", "seasons", "lifestyle")),
    WyrQuestion(132, "Would you rather explore ancient ruins or discover a brand new city?",
      "Explore ancient ruins", "Discover new city", "travel", "easy", "chill", List("history", "adventure", "travel")),
    WyrQuestion(133, "Would you rather stay in a luxury hotel or camp in the wild for a week?",
      "Luxury hotel", "Camp in the wild", "travel", "easy", "chill", List("accommodation", "nature", "comfort")),
    WyrQuestion(134, "Would you rather see the Northern Lights or the Sahara Desert at sunset?",
      "Northern Lights", "Sahara sunset", "travel", "easy", "chill", List("nature", "beauty", "travel")),
    WyrQuestion(135, "Would you rather live in one perfect city forever or move to a new country every year?",
      "One perfect city forever", "New country every year", "travel", "hard", "serious", List("home", "adventure", "change")),

    // ── FOOD / CHILL ───────────────────────────────────────────────────────────
    WyrQuestion(136, "Would you rather give up sugar or give up salt for the rest of your life?",
      "Give up sugar", "Give up salt", "food", "medium", "chill", List("food", "taste", "diet")),
    WyrQuestion(137, "Would you rather eat breakfast food for every meal or eat dinner food for breakfast?",
      "Breakfast for every meal", "Dinner for breakfast", "food", "easy", "chill", List("food", "meals", "habits")),
    WyrQuestion(138, "Would you rather only eat spicy food or only eat bland food forever?",
      "Only spicy food", "Only bland food", "food", "medium", "chill", List("food", "taste", "spicy")),
    WyrQuestion(139, "Would you rather be a world-class chef or a world-class food critic?",
      "World-class chef", "World-class food critic", "food", "medium", "chill", List("cooking", "food", "career")),
    WyrQuestion(140, "Would you rather eat a new cuisine every day or eat your favorite meal every day?",
      "New cuisine every day", "Favorite meal every day", "food", "easy", "chill", List("food", "variety", "routine")),
    WyrQuestion(141, "Would you rather drink only coffee or only tea for the rest of your life?",
      "Only coffee", "Only tea", "food", "easy", "chill", List("drinks", "coffee", "tea")),
    WyrQuestion(142, "Would you rather never eat chocolate again or never eat cheese again?",
      "Never eat chocolate", "Never eat cheese", "food", "medium", "chill", List("food", "dessert", "dairy")),
    WyrQuestion(143, "Would you rather eat food that looks disgusting but tastes amazing or food that looks amazing but tastes terrible?",
      "Looks bad, tastes amazing", "Looks amazing, tastes bad", "food", "easy", "chill", List("food", "appearance", "taste")),
    WyrQuestion(144, "Would you rather own a bakery or a restaurant?",
      "Own a bakery", "Own a restaurant", "food", "easy", "chill", List("food", "business", "cooking")),
    WyrQuestion(145, "Would you rather only eat pizza forever or only eat burgers forever?",
      "Pizza forever", "Burgers forever", "food", "easy", "silly", List("food", "taste", "simple")),

    // ── SCHOOL / CHILL ─────────────────────────────────────────────────────────
    WyrQuestion(146, "Would you rather learn any subject in one day or master one subject completely?",
      "Learn any subject in one day", "Master one subject completely", "school", "hard", "serious", List("learning", "knowledge", "school")),
    WyrQuestion(147, "Would you rather have an exam every day or have one enormous final exam at the end of the year?",
      "Exam every day", "One huge final exam", "school", "medium", "chill", List("exams", "school", "stress")),
    WyrQuestion(148, "Would you rather study with loud music or in total silence?",
      "With loud music", "In total silence", "school", "easy", "chill", List("studying", "music", "focus")),
    WyrQuestion(149, "Would you rather skip university and be self-taught or go to the best university but struggle financially?",
      "Self-taught, skip university", "Best university, financial struggle", "school", "hard", "serious", List("university", "self-learning", "money")),
    WyrQuestion(150, "Would you rather always understand math perfectly or always write perfectly?",
      "Perfect math understanding", "Perfect writing", "school", "medium", "chill", List("math", "writing", "school")),
    WyrQuestion(151, "Would you rather have free access to every online course in the world or free access to every book ever written?",
      "Every online course", "Every book ever", "school", "medium", "chill", List("learning", "books", "education")),
    WyrQuestion(152, "Would you rather teach a subject you love or study a subject you hate because it pays more?",
      "Teach what you love", "Study what pays more", "school", "hard", "serious", List("career", "passion", "money")),
    WyrQuestion(153, "Would you rather only have group projects or only work alone for the rest of school?",
      "Only group projects", "Only work alone", "school", "easy", "chill", List("teamwork", "school", "independence")),
    WyrQuestion(154, "Would you rather speak every language or master every programming language?",
      "Speak every human language", "Master every programming language", "school", "medium", "chill", List("language", "coding", "skill")),
    WyrQuestion(155, "Would you rather never do homework again or never take exams again?",
      "No homework ever", "No exams ever", "school", "easy", "chill", List("student", "study", "school")),
    WyrQuestion(156, "Would you rather be great at math or great at public speaking?",
      "Great at math", "Great at public speaking", "school", "medium", "chill", List("skills", "study", "confidence")),

    // ── MONEY / SERIOUS ────────────────────────────────────────────────────────
    WyrQuestion(157, "Would you rather earn a modest salary doing your passion or a huge salary doing work you hate?",
      "Modest salary, passion", "Huge salary, hate work", "money", "hard", "serious", List("career", "money", "happiness")),
    WyrQuestion(158, "Would you rather be born rich or become rich through hard work?",
      "Born rich", "Earn it through hard work", "money", "hard", "serious", List("wealth", "effort", "privilege")),
    WyrQuestion(159, "Would you rather have one million dollars now or ten thousand dollars every month forever?",
      "One million now", "Ten thousand every month forever", "money", "medium", "serious", List("finance", "future", "wealth")),
    WyrQuestion(160, "Would you rather spend all your money on experiences or on things?",
      "Spend on experiences", "Spend on things", "money", "medium", "chill", List("money", "lifestyle", "values")),
    WyrQuestion(161, "Would you rather lose all your money once and recover or never lose money but never gain more?",
      "Lose all then recover", "Never lose, never gain", "money", "hard", "serious", List("money", "risk", "stability")),
    WyrQuestion(162, "Would you rather have a guaranteed income doing nothing or no income but work you love?",
      "Guaranteed income doing nothing", "No income but love the work", "money", "hard", "serious", List("money", "work", "purpose")),
    WyrQuestion(163, "Would you rather inherit a business or start one from scratch?",
      "Inherit a business", "Start from scratch", "money", "hard", "serious", List("business", "money", "ambition")),
    WyrQuestion(164, "Would you rather donate 90 percent of your income to charity or spend 90 percent on your family?",
      "90 percent to charity", "90 percent on family", "money", "hard", "serious", List("money", "charity", "family")),
    WyrQuestion(165, "Would you rather be rich but unknown or famous but always judged?",
      "Rich but unknown", "Famous but judged", "money", "hard", "serious", List("fame", "wealth", "pressure")),
    WyrQuestion(166, "Would you rather have unlimited free food or unlimited free transport?",
      "Unlimited free food", "Unlimited free transport", "daily", "medium", "chill", List("money", "food", "travel")),

    // ── CHAOTIC / SILLY ────────────────────────────────────────────────────────
    WyrQuestion(167, "Would you rather have every door you touch disappear or every chair you sit on collapse?",
      "Doors disappear", "Chairs collapse", "chaotic", "easy", "silly", List("chaos", "random", "weird")),
    WyrQuestion(168, "Would you rather randomly swap bodies with a stranger every midnight or randomly swap voices every noon?",
      "Swap bodies at midnight", "Swap voices at noon", "chaotic", "hard", "silly", List("chaos", "body", "random")),
    WyrQuestion(169, "Would you rather have your search history read aloud every time you enter a room or have your old texts displayed on a billboard?",
      "Search history read aloud", "Old texts on billboard", "chaotic", "hard", "silly", List("embarrassing", "privacy", "chaos")),
    WyrQuestion(170, "Would you rather sneeze confetti or cough glitter for the rest of your life?",
      "Sneeze confetti", "Cough glitter", "chaotic", "easy", "silly", List("body", "chaos", "funny")),
    WyrQuestion(171, "Would you rather live in a world where gravity reverses for 1 hour every day or the sun rises at a random time?",
      "Gravity reverses 1hr a day", "Sun rises at random time", "chaotic", "hard", "silly", List("physics", "chaos", "world")),
    WyrQuestion(172, "Would you rather have your phone randomly call people from your contacts or randomly send texts from your drafts?",
      "Random calls", "Random draft texts", "chaotic", "medium", "silly", List("phone", "chaos", "embarrassing")),
    WyrQuestion(173, "Would you rather lose one random memory every day or gain one random stranger's memory every day?",
      "Lose a memory daily", "Gain stranger's memory daily", "chaotic", "hard", "silly", List("memory", "chaos", "random")),
    WyrQuestion(174, "Would you rather randomly switch jobs with someone every Monday or randomly switch homes every Friday?",
      "Switch jobs every Monday", "Switch homes every Friday", "chaotic", "hard", "silly", List("chaos", "job", "home")),
    WyrQuestion(175, "Would you rather have random objects float around you at unpredictable times or random sounds play near you?",
      "Random floating objects", "Random sounds nearby", "chaotic", "easy", "silly", List("chaos", "physics", "random")),
    WyrQuestion(176, "Would you rather have the weather change every 5 minutes or have seasons change every week?",
      "Weather every 5 minutes", "Seasons every week", "chaotic", "easy", "silly", List("weather", "chaos", "nature")),

    // ── RELATIONSHIPS / SERIOUS ────────────────────────────────────────────────
    WyrQuestion(177, "Would you rather always know what your friends really think of you or never know but always feel loved?",
      "Know what friends think", "Never know but feel loved", "relationships", "hard", "serious", List("friendship", "truth", "feelings")),
    WyrQuestion(178, "Would you rather never fight with the people you love or always fight but always resolve it?",
      "Never fight", "Always fight but resolve", "relationships", "hard", "serious", List("conflict", "love", "relationships")),
    WyrQuestion(179, "Would you rather fall in love quickly and deeply or slowly and carefully?",
      "Quickly and deeply", "Slowly and carefully", "relationships", "medium", "chill", List("love", "romance", "emotion")),
    WyrQuestion(180, "Would you rather have a best friend who is always honest or one who always supports you?",
      "Always honest friend", "Always supportive friend", "relationships", "hard", "serious", List("friendship", "honesty", "support")),
    WyrQuestion(181, "Would you rather stay close to your family forever or build your own life far away?",
      "Stay close to family", "Build life far away", "relationships", "hard", "serious", List("family", "independence", "roots")),
    WyrQuestion(182, "Would you rather have a partner who makes you laugh every day or one who challenges you to grow?",
      "Makes you laugh", "Challenges you to grow", "relationships", "hard", "serious", List("love", "growth", "happiness")),
    WyrQuestion(183, "Would you rather end a friendship to avoid drama or keep a toxic friend to avoid loneliness?",
      "End the friendship", "Keep toxic friend", "relationships", "hard", "serious", List("friendship", "toxic", "loneliness")),
    WyrQuestion(184, "Would you rather know you are someone's first choice or always be someone's safe choice?",
      "First choice", "Safe choice", "relationships", "hard", "serious", List("love", "choice", "emotions")),
    WyrQuestion(185, "Would you rather have a group of loyal friends you rarely see or a close friend you see every day?",
      "Loyal group, rarely see", "One close friend, every day", "relationships", "medium", "chill", List("friendship", "loyalty", "presence")),
    WyrQuestion(186, "Would you rather be loved by someone you do not love or love someone who does not love you back?",
      "Loved but do not love back", "Love someone unrequited", "relationships", "hard", "serious", List("love", "heartbreak", "emotions")),
    WyrQuestion(187, "Would you rather have one person who deeply understands you or many people who like you on the surface?",
      "One who understands deeply", "Many who like you on surface", "relationships", "hard", "serious", List("understanding", "friendship", "depth")),
    WyrQuestion(188, "Would you rather go through a painful breakup and learn a lot or stay in a comfortable but unfulfilling relationship?",
      "Painful breakup, big lesson", "Comfortable but unfulfilling", "relationships", "hard", "serious", List("breakup", "love", "growth")),
    WyrQuestion(189, "Would you rather always say I love you first or always wait for the other person to say it?",
      "Always say it first", "Always wait", "relationships", "medium", "chill", List("love", "courage", "romance")),
    WyrQuestion(190, "Would you rather have your partner know all your secrets or keep some things private forever?",
      "Partner knows all secrets", "Keep some things private", "relationships", "hard", "serious", List("trust", "privacy", "relationships")),
    WyrQuestion(191, "Would you rather have a long-distance relationship with your soulmate or be with someone nearby who is almost right?",
      "Long-distance soulmate", "Nearby almost-right person", "relationships", "hard", "serious", List("love", "distance", "soulmate")),
    WyrQuestion(192, "Would you rather your parents love your partner or your friends love your partner?",
      "Parents love partner", "Friends love partner", "relationships", "medium", "chill", List("family", "friends", "relationships")),
    WyrQuestion(193, "Would you rather forgive someone who never apologizes or wait forever for an apology that may never come?",
      "Forgive without apology", "Wait for apology", "relationships", "hard", "serious", List("forgiveness", "apology", "healing")),
    WyrQuestion(194, "Would you rather grow apart from your best friend naturally or have one big dramatic falling out?",
      "Grow apart naturally", "Big dramatic falling out", "relationships", "hard", "serious", List("friendship", "change", "endings")),
    WyrQuestion(195, "Would you rather have a friendship that lasts 5 intense years or a friendship that lasts 50 quiet years?",
      "5 intense years", "50 quiet years", "relationships", "hard", "serious", List("friendship", "time", "depth")),
    WyrQuestion(196, "Would you rather be with someone who pushes your limits or someone who accepts you exactly as you are?",
      "Someone who pushes limits", "Someone who accepts you as is", "relationships", "hard", "serious", List("love", "growth", "acceptance")),
    WyrQuestion(197, "Would you rather have the courage to say what you feel to the person you love or always wonder what could have been?",
      "Say what you feel", "Wonder what could have been", "relationships", "hard", "serious", List("courage", "love", "regret")),
    WyrQuestion(198, "Would you rather end every relationship on good terms or cut people off completely to protect yourself?",
      "Always end on good terms", "Cut people off to protect yourself", "relationships", "hard", "serious", List("endings", "protection", "relationships")),
    WyrQuestion(199, "Would you rather lose your phone for a week or lose your wallet for a day?",
      "Lose phone for a week", "Lose wallet for a day", "daily", "easy", "chill", List("life", "routine", "choice")),
    WyrQuestion(200, "Would you rather have many acquaintances or one or two deep lifelong friendships?",
      "Many acquaintances", "One or two deep friendships", "relationships", "medium", "chill", List("friendship", "social", "depth"))
  )
}

object RecommendationEngine {

  val availableCategories: List[String] =
    QuestionBank.allQuestions.map(_.category).distinct.sorted

  val availableIntensities: List[String] =
    QuestionBank.allQuestions.map(_.intensity).distinct.sorted

  val availableMoods: List[String] =
    QuestionBank.allQuestions.map(_.mood).distinct.sorted

  def getUserPreferences(state: ConversationState): Map[String, String] = {
    state.preferences
  }

  private def clean(value: String): String = {
    value.trim.toLowerCase
  }

  def isValidPreference(key: String, value: String): Boolean = {
    val cleanKey = clean(key)
    val cleanValue = clean(value)

    cleanKey match {
      case "category" =>
        availableCategories.contains(cleanValue)

      case "intensity" =>
        availableIntensities.contains(cleanValue)

      case "mood" =>
        availableMoods.contains(cleanValue)

      case "avoidCategory" =>
        availableCategories.contains(cleanValue)

      case _ =>
        false
    }
  }

  def updatePreferences(
      preferences: Map[String, String],
      key: String,
      value: String
  ): Map[String, String] = {
    val cleanKey = clean(key)
    val cleanValue = clean(value)

    if (isValidPreference(cleanKey, cleanValue)) {
      preferences + (cleanKey -> cleanValue)
    } else {
      preferences
    }
  }

  def updatePreferences(
      state: ConversationState,
      key: String,
      value: String
  ): ConversationState = {
    val newPreferences = updatePreferences(state.preferences, key, value)
    state.copy(preferences = newPreferences)
  }

  def preferenceMessage(key: String, value: String): String = {
    val cleanKey = clean(key)
    val cleanValue = clean(value)

    if (isValidPreference(cleanKey, cleanValue)) {
      s"Got it! I saved your $cleanKey preference as '$cleanValue'."
    } else {
      s"I couldn't save '$cleanValue' as a $cleanKey preference. Try one of the available options."
    }
  }

  def availableQuestions(
      data: List[WyrQuestion],
      alreadyAsked: Set[Int]
  ): List[WyrQuestion] = {
    data.filter(question => !alreadyAsked.contains(question.id))
  }
}


    
