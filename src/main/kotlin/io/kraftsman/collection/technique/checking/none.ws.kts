val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")
val emptyList = emptyList<String>()

fruits.none()
fruits.isEmpty()
fruits.isNotEmpty()

emptyList.none()
emptyList.isEmpty()
emptyList.isNotEmpty()

fruits.none { it.endsWith("z") }
fruits.none { it.endsWith("e") }