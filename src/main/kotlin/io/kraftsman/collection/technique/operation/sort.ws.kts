val numbers = mutableListOf(4, 1, 3, 5, 2)
val chars = mutableListOf('b', 'e', 'a', 'd', 'c')
val strings = mutableListOf(
    "cherry",
    "apple",
    "banana",
    "grape",
    "papaya"
)
val intArray = intArrayOf(4, 1, 5, 3, 2)

numbers.sort()
println(numbers)

chars.sort()
println(chars)

strings.sort()
println(strings)

intArray.sort(0, 3)
intArray.contentToString()
