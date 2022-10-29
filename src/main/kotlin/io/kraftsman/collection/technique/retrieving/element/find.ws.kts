val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

words.find { it.startsWith("some") }
words.find { it.startsWith("any") }
// find 封裝 firstOrNull

words.filter { it.startsWith("s") }

words.filter { it.startsWith("z") }