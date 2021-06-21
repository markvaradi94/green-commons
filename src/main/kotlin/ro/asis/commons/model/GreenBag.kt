package ro.asis.commons.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.bson.types.ObjectId

data class GreenBag(
    @JsonProperty("id")
    var id: String = ObjectId.get().toHexString(),

    @JsonProperty("description")
    var description: String? = null,

    @JsonProperty("price")
    var price: Double = 0.0,

    @JsonProperty("quantity")
    var quantity: Int = 0,

    @JsonProperty("imageUrl")
    var imageUrl: String? = null
)
