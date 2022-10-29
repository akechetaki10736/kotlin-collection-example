val fruits = arrayOf(
    "Grape",
    "Muskmelon",
    "Pear",
    "Kumquat",
    "Coconut",
    "Avocado",
    "Tangerine"
)

fruits.sliceArray(1..3).contentToString()
fruits.sliceArray((0..4 step 2).toList()).contentToString()

fruits.sliceArray(listOf(3, 0 ,0)).contentToString()
fruits.sliceArray(setOf(3, 5 ,0)).contentToString()
fruits.sliceArray(setOf(3, 0 ,0)).contentToString()

val numbers = intArrayOf(-4,-1,0,3,10)
val numbersInit = numbers.copyOf(numbers.size + 5)


