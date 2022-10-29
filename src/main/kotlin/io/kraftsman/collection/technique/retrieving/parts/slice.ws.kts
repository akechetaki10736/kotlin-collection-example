val fruits = listOf(
    "Grape",
    "Muskmelon",
    "Pear",
    "Kumquat",
    "Coconut",
    "Avocado",
    "Tangerine"
)

fruits.slice(1..3)
fruits.slice(0..4 step 2)

fruits.slice(listOf(3, 0 ,0))
fruits.slice(setOf(3, 5 ,0))
fruits.slice(setOf(3, 0 ,0))
