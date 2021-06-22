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

    @NotNull
    @NotBlank
    @JsonProperty("city")
    var city: String,

    @NotNull
    @NotBlank
    @JsonProperty("streetName")
    var streetName: String,

    @NotNull
    @NotBlank
    @JsonProperty("streetNumber")
    var streetNumber: String,

    @JsonProperty("building")
    var building: String? = null,

    @JsonProperty("staircase")
    var staircase: String? = null,

    @JsonProperty("floor")
    var floor: Int? = null,

    @JsonProperty("flat")
    var flat: String? = null
)
