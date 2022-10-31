val fruits = mutableListOf("Grape", "Muskmelon", "Kumquat", "Pear")

fruits.sortByDescending { it.length }
println(fruits)