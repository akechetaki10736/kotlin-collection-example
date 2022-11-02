val fruits = listOf("Grape", "Papaya", "Pineapple", "Pear")

fruits.filterIndexed { index, value ->
    (index != 0) && (value.length < 5)
}