package ro.asis.commons.filters

data class OrderFilters(
    var id: String? = null,
    var clientId: String? = null,
    var providerId: String? = null,
    var status: String? = null
)
