val fruits = listOf("Grape", "Muskmelon", "Pear", "Kumquat")

fruits.dropLastWhile {
    it.length > 4
}

fruits.dropLastWhile {
    it.contains('a') or it.contains('e')
}