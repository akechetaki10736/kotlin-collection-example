val numbers = mutableListOf(1, 2, 3, 4, 5)

if (numbers.size == 0) {
    println("Empty collection")
} else {
    println("There has elements in collection")
}

if (numbers.count() == 0) {
    println("Empty collection")
} else {
    println("There has elements in collection")
}

if (numbers.isEmpty()) {
    println("Empty collection")
} else {
    println("There has elements in collection")
}

numbers.clear()
numbers.isEmpty()

val emptyNumbers = emptyList<Int>()
emptyNumbers.isEmpty()