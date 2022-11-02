val numbers = mutableListOf(1, 3, 5, 7, 9)

numbers.removeAll(listOf(2, 3, 7))
println(numbers)

val names = mutableListOf("John", "Tom", "Mary")

names.removeAll { it.contains("o") }
println(names)

