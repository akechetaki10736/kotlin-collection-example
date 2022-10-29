val numbers = listOf(1 ,2 , 3, 4, 5, 6, 7, 8 ,9, 10)
val chars = listOf('a', 'b', 'c', 'd', 'e', 'f', 'g')

numbers.chunked(3) { it.sum() }

chars.chunked(2) {
    it.joinToString(
        separator = "+",
        prefix = "(",
        postfix = ")"
    )
}

