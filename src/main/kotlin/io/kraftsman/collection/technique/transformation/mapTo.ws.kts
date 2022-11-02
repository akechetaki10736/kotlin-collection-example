data class Customer(
    val name: String,
    val age: Int
)

data class Address(
    val city: String,
    val postcode: String,
)

val orders = mapOf(
    Customer("Sue", 23) to Address("Taipei", "116"),
    Customer("Mary", 27) to Address("Keelung", "202"),
    Customer("Peter", 37) to Address("Taoyuan", "326")
)
val addressBar = mutableListOf("703 Tainan Craig")

orders.mapTo(addressBar) { (customer, address) ->
    "${address.postcode} ${address.city} ${customer.name}"
}

addressBar.add("423 Taichung Amos")