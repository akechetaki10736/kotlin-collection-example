package io.kraftsman.collection.technique.retrieving.element

data class Address(
    val city: String,
    val postcode: String
)

val orders = mapOf(
    "Sue" to Address("Taipei", "116"),
    "Mary" to Address("Keelung", "202"),
    "Peter" to Address("Taoyuan", "326"),
    "Amos" to Address("Taichung", "423"),
    "Craig" to Address("Tainan", "703")
)

orders.getValue("Sue")
orders["Sue"]