val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val emptyList = emptyList<String>()

fruits.all { it.endsWith("e") }

emptyList.all { it == "anything" }