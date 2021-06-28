package ro.asis.commons.model

import com.fasterxml.jackson.annotation.JsonProperty
import org.bson.types.ObjectId
import javax.validation.constraints.NotBlank
import javax.validation.constraints.NotNull

data class Address(
    @JsonProperty("id")
    var id: String = ObjectId.get().toHexString(),

    @JsonProperty("zipCode")
    var zipCode: String? = null,

    @JsonProperty("city")
    var city: String? = null,

    @JsonProperty("streetName")
    var streetName: String? = null,

    @JsonProperty("streetNumber")
    var streetNumber: String? = null,

    @JsonProperty("building")
    var building: String? = null,

    @JsonProperty("staircase")
    var staircase: String? = null,

    @JsonProperty("floor")
    var floor: Int? = null,

    @JsonProperty("flat")
    var flat: String? = null
)
