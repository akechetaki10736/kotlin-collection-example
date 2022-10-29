val numbers = listOf(1, 2, 3, 4, 5)

numbers.zipWithNext()

numbers.zipWithNext { a, b ->  a * b }
