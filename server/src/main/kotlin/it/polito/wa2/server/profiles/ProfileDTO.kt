package it.polito.wa2.server.profiles

data class ProfileDTO(
    val email: String,
    val firstName: String,
    val lastName: String,
    val password: String,
    val salt: String
)

fun Profile.toDTO(): ProfileDTO = ProfileDTO(
    email,
    firstName,
    lastName,
    password,
    salt
)