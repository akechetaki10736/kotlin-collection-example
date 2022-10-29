val fruits = listOf("Grape", "Muskmelon", "Pear", "Kumquat")

fruits.takeWhile {
    it.length > 4
}

fruits.takeWhile {
    it.startsWith("A")
}

fruits.takeLastWhile { it.length > 4 }

fruits.takeLastWhile { it.startsWith("Z") }