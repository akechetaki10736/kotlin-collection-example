val numbers = listOf(2 ,3 ,4 ,5 ,6, 7)
val emptyList = emptyList<Int>()
val nothingInList = listOf<Int>()

numbers.last()
numbers[numbers.size - 1]
numbers.last { it < 6 }


// NoSuchElementException
emptyList.last()
emptyList.last { it < 6 }
nothingInList.last()
nothingInList.last { it < 6 }