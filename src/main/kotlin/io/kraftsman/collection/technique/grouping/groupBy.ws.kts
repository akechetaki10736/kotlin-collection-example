data class Employee(
    val id: Int,
    val name: String,
    val department: String,
    val skills: List<String>? = null
)

val fruits = listOf(
    "cOcoNut",
    "PaPaYa",
    "CRanBerry",
    "pINEApple",
    "BaNaNa",
    "PeaR"
)

fruits.groupBy { it.first() }
// 根據回傳值作為 group 依據
fruits.groupBy(
    { it.first().uppercase() },
    { it.lowercase().replaceFirstChar(Char::uppercase) }
)

val employees = listOf(
    Employee(1, "Tom", "Backend"),
    Employee(2, "John", "IT"),
    Employee(3, "Simon", "Backend"),
    Employee(4, "Mark", "IT"),
    Employee(5, "Tracy", "Design"),
)

employees.groupBy({ it.department }, { it.name })