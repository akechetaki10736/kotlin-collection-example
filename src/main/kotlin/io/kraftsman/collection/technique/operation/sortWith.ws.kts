val target = mutableListOf("aaa", "bb", "c")
val lengthComparator = Comparator { str1: String, str2: String ->
    str1.length - str2.length
}

target.sortWith(lengthComparator)
println(target)

target.sortWith(compareBy { it.length })
println(target)

target.sortWith(compareByDescending { it.length })
println(target)