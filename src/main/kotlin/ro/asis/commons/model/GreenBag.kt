package ro.asis.commons.model

import org.bson.types.ObjectId

data class GreenBag(
    var id: String = ObjectId.get().toHexString(),
    var description: String? = null,
    var price: Double = 0.0,
    var quantity: Int = 0,
    var imageUrl: String? = null
)
