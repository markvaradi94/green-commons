package ro.asis.commons.model

data class Inventory(
    private val bags: MutableList<GreenBag> = mutableListOf()
)
