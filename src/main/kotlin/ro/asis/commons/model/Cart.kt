package ro.asis.commons.model

data class Cart(
    var providerId: String? = null,
    var bags: MutableList<GreenBag> = mutableListOf(),
    var totalPrice: Double = 0.0
    //TODO totalPrice will be calculated from bags
    //TODO pass totalPrice from Cart to Order when checking out
)
