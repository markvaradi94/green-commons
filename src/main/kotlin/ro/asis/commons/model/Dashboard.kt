package ro.asis.commons.model

data class Dashboard(
    private val orders: MutableList<Order> = mutableListOf()
)
