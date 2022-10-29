val words = listOf("Lets", "find", "something", "in", "collection", "somehow")

words.findLast { it.startsWith("some") }
words.findLast { it.startsWith("any") }