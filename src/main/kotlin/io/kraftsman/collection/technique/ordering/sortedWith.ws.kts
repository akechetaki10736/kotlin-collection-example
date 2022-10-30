val target = listOf("aaa", "bb", "c")

val lengthComparator = Comparator { str1: String, str2: String ->
    str1.length - str2.length
}

val warehouse = listOf(
    "Apple" to 123,
    "Papaya" to 8,
    "Orange" to 72,
    "Grape" to 21,
    "Banana" to 205,
    "Pineapple" to 47
)

target.sortedWith(lengthComparator)

target.sortedWith { str1: String, str2: String ->
    str1.length - str2.length
}

target.sortedWith(compareBy { it.length })
target.sortedWith(compareByDescending { it.length })

warehouse.sortedWith(
    compareBy({ it.first }, { it.second })
)
