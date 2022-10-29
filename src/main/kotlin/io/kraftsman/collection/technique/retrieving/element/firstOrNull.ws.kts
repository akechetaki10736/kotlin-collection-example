val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

emptyList.firstOrNull()
nothingInList.firstOrNull()

val numbers = listOf(2, 3, 5, 6, 7)

numbers.first { it > 3 }
emptyList.firstOrNull { it > 3 }
nothingInList.firstOrNull { it > 3 }

