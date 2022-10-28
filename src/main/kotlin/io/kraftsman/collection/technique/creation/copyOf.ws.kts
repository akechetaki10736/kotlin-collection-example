val arrayOfNumbers = intArrayOf(1, 2, 3, 4, 5)
val smallerArrayOfNumber = arrayOfNumbers.copyOf(2)
smallerArrayOfNumber.contentToString()

val biggerArrayOfNumber = arrayOfNumbers.copyOf(6)
biggerArrayOfNumber.contentToString()

val arrayOfStrings = arrayOf("Apple", "Banana", "Orange")
val smallerArrayOfStrings = arrayOfStrings.copyOf(3)
smallerArrayOfStrings.contentToString()

val biggerArrayOfStrings = arrayOfStrings.copyOf(5)
biggerArrayOfStrings.contentToString()