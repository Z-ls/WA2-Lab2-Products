package it.polito.wa2.server.profiles

interface ProfileService {
//    GET /API/profiles/{email}
//    POST /API/profiles
//    PUT /API/profiles/{email}

    fun getProfile(email: String): ProfileDTO?
    fun createProfile(profile: Profile): String?
    fun updateProfile(email: String, profile: Profile): String?
}