package ro.asis.commons.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Cart(
    @JsonProperty("providerId")
    var providerId: String? = null,

    @JsonProperty("bags")
    var bags: MutableList<GreenBag> = mutableListOf(),

    @JsonProperty("totalPrice")
    var totalPrice: Double = 0.0
) {
    init {
        totalPrice = calculateTotalPrice()
    }

    private fun calculateTotalPrice() = bags.sumOf { it.price * it.quantity }
}
