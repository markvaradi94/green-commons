package ro.asis.commons.filters

data class GuestFilters(
    var firstName: String? = null,
    var lastName: String? = null,
    var phoneNumber: String? = null,
    var email: String? = null,
    var city: String? = null,
    var streetName: String? = null
)
