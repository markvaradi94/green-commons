package ro.asis.commons.model

import com.fasterxml.jackson.annotation.JsonProperty

data class Dashboard(
    @JsonProperty("orders")
    var orders: MutableList<Order> = mutableListOf()
)
