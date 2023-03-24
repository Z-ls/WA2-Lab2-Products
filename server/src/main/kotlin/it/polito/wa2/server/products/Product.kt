package it.polito.wa2.server.products

import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table

@Entity
@Table(name = "products")
class Product {
    @Id
    var id: Long = 0

    var name: String = ""
    var price: Double = 0.0
    var description: String = ""
}