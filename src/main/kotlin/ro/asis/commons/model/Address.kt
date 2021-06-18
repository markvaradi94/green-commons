package ro.asis.commons.model

import org.bson.types.ObjectId

data class Address(
    var id: String = ObjectId.get().toHexString(),
    var city: String = "",
    var zipCode: String? = null,
    var streetName: String = "",
    var streetNumber: String = "",
    var building: String? = null,
    var staircase: String? = null,
    var floor: Int? = null,
    var flat: String? = null
)
