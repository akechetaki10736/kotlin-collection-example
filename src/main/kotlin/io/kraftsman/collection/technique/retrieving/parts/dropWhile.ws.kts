val fruits = listOf("Grape", "Muskmelon", "Pear", "Kumquat")

fruits.dropWhile {
    it.length > 4
}

fruits.dropWhile {
    it.startsWith('A')
}