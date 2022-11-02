data class Customer(
    val name: String,
    val age: Int
)

val customers = listOf(
    Customer("Sue", 23),
    Customer("Mary", 27),
    Customer("Peter", 37),
    Customer("Amos", 32),
    Customer("Craig", 45),
)

customers.mapIndexed { index, customer ->
    "$index: ${customer.name}"
}