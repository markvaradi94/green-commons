package ro.asis.commons.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Cart(
    @JsonProperty("providerId")
    var providerId: String? = null,

    @JsonProperty("bags")
    var bags: MutableList<GreenBag> = mutableListOf(),

    @JsonProperty("totalPrice")
    var totalPrice: Double = 0.0
    //TODO totalPrice will be calculated from bags
    //TODO pass totalPrice from Cart to Order when checking out
)
