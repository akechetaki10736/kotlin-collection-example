val onlyOneNumber = listOf(2)
val numbers = listOf(2, 2, 3, 2, 2, 2)

onlyOneNumber.single()
numbers.single {
    it != 2
}
