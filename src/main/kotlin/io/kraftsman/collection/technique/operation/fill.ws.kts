val numbers = mutableListOf(1, 3, 5, 7, 9)

numbers.fill(10)
println(numbers)

val numbers2 = mutableListOf(1, 3, 5, 7, 9)

numbers2.replaceAll { 10 }
println(numbers2)

val numberArray = intArrayOf(1, 3, 5, 7, 9)

numberArray.fill(10, 0, 2)
numberArray.contentToString()

