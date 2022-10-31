val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val emptyList = emptyList<String>()

fruits.any()
fruits.isEmpty()
fruits.isNotEmpty()

emptyList.any()
emptyList.isEmpty()
emptyList.isNotEmpty()

fruits.any { it.endsWith("e") }
fruits.any { it.endsWith("z") }