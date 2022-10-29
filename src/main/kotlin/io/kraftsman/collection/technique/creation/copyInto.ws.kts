val arrayOfFruits = arrayOf("Apple", "Banana", "Orange")
val destinationArray = arrayOf("BlackBerry", "Coconut", "Cherry", "Peach", "Avocado")

arrayOfFruits.copyInto(destinationArray, 1, 1, 3)
destinationArray.contentToString()

