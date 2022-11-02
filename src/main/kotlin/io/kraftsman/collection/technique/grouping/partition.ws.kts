abstract class Person(
    open val id: Int,
    open val firstName: String,
    open val lastName: String,
)

data class Student(
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    val email: String,
    val grade: Int,
): Person(id, firstName, lastName)

data class Teacher(
    override val id: Int,
    override val firstName: String,
    override val lastName: String,
    val level: Int,
): Person(id, firstName, lastName)

val staff = listOf(
    Teacher(1, "Tommy", "Wong", 3),
    Teacher(3, "John", "Doe", 1),
    Teacher(5, "Sean", "Lin", 6)
)

val dividedStaff = staff.partition { it.level <= 3 }
println(dividedStaff)

dividedStaff.first
dividedStaff.second

//val (junior, senior) = staff.partition { it.level <= 3 }
//junior
//senior

val people = listOf(
    Teacher(1, "Tommy", "Wong", 3),
    Teacher(3, "John", "Doe", 1),
    Student(5, "Sean", "Lin", "sean.lin@gmail.com", 6)
)

people.partition { it is Teacher }
val (teachers, students) = staff.partition { it.level <= 3 }