package it.polito.wa2.server.profiles

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "profiles")
class Profile {
    @Id
    var id: Long = 0

    var firstName: String = ""
    var lastName: String = ""
    var email: String = ""
    var password: String = ""
    var salt: String = ""
}