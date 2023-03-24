package it.polito.wa2.server.profiles

data class ProfileDTO(
    val id: Long,
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val salt: String
)

fun Profile.toDTO(): ProfileDTO = ProfileDTO(
    id,
    firstName,
    lastName,
    email,
    password,
    salt
)