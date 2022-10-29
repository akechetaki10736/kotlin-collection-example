val numbers = listOf(2 ,3 ,4 ,5 ,6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

numbers.lastOrNull()
emptyList.lastOrNull()
nothingInList.lastOrNull()

numbers.lastOrNull { it < 6 }
emptyList.lastOrNull { it < 6 }
nothingInList.lastOrNull { it < 6 }
