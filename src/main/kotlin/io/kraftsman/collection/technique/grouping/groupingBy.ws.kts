val languages = listOf(
    "java",
    "scala",
    "kotlin",
    "javascript",
    "groovy",
    "ruby",
    "react",
    "swift"
)

languages.groupingBy { it.first().uppercase() }.eachCount()

// using group
languages.groupBy { it.first().uppercase() } .map {
    it.key to it.value.count()
} .toMap()

