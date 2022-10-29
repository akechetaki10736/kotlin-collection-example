data class Address(
    val city: String,
    val postcode: String
)

val orders = mutableMapOf(
    "Sue" to Address("Taipei", "116"),
    "Mary" to Address("Keelung", "202"),
    "Peter" to Address("Taoyuan", "326"),
    "Amos" to Address("Taichung", "423"),
    "Craig" to Address("Tainan", "703")
)

orders.getOrPut("Sue") {
    Address("Taitung", "950")
}

orders.getOrPut("Simmons") {
    Address("Taitung", "950")
}

orders.toString()