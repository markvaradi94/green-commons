package ro.asis.commons.model

import ro.asis.commons.enums.OrderStatus

data class Order(
    var id: String?,
    var clientId: String,
    var providerId: String,
    var status: OrderStatus,
    var bags: List<GreenBag>,
    var totalPrice: Double
)
