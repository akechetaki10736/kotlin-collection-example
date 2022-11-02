data class Employee(
    val id: Int,
    val name: String,
    val department: String,
    val skills: List<String>? = null
)


val chars = listOf('A', 'a', 'b', 'B', 'A', 'a')
var fruits = listOf("apple", "banana", "mango", "berry")

chars.distinctBy { it.uppercase() }

fruits.distinctBy { it.first() }

val employees = listOf(
    Employee(1, "Tom", "Backend"),
    Employee(2, "John", "IT"),
    Employee(3, "Simon", "Backend"),
    Employee(4, "Mark", "IT"),
    Employee(5, "Tracy", "Design"),
)

employees.distinctBy { it.department }
