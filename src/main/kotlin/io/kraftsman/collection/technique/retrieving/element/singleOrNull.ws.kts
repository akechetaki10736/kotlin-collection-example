val numbers = listOf(2, 2, 3, 2, 2, 2)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

numbers.singleOrNull()
emptyList.singleOrNull()
nothingInList.singleOrNull()

numbers.singleOrNull { it > 5 }
emptyList.singleOrNull { it > 5 }
nothingInList.singleOrNull { it > 5 }