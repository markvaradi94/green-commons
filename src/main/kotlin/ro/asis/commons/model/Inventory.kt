package ro.asis.commons.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Inventory(
    @JsonProperty("bags")
    private val bags: MutableList<GreenBag> = mutableListOf()
)
