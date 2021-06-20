package ro.asis.commons.model

import org.bson.types.ObjectId
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class Address(
    var id: String = ObjectId.get().toHexString(),
    var zipCode: String? = null,

    @NotNull
    @NotBlank
    var city: String,

    @NotNull
    @NotBlank
    var streetName: String,

    @NotNull
    @NotBlank
    var streetNumber: String,

    var building: String? = null,
    var staircase: String? = null,
    var floor: Int? = null,
    var flat: String? = null
)
