package ro.asis.commons.model

data class Cart(
    var providerId: String? = null,
    var bags: MutableList<GreenBag> = mutableListOf()
)
