package ro.asis.commons.model

import com.fasterxml.jackson.annotation.JsonProperty
import ro.asis.commons.enums.OrderStatus

data class Order(
    @JsonProperty("id")
    var id: String?,

    @JsonProperty("clientId")
    var clientId: String,

    @JsonProperty("providerId")
    var providerId: String,

    @JsonProperty("status")
    var status: OrderStatus,

    @JsonProperty("bags")
    var bags: List<GreenBag>,

    @JsonProperty("totalPrice")
    var totalPrice: Double
)
