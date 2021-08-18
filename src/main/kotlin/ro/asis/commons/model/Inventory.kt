package ro.asis.commons.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Inventory(
    @JsonProperty("bags")
    var bags: MutableList<GreenBag> = mutableListOf()
)
