package ro.asis.commons.filters

data class AccountFilters(
    var id: String? = null,
    var password: String? = null,
    var email: String? = null,
    var phoneNumber: String? = null,
    var type: String? = null
)
