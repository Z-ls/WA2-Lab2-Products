package it.polito.wa2.server.products

data class ProductDTO(
    val id: Long,
    val name: String,
    val price: Double,
    val description: String
)

fun Product.toDTO(): ProductDTO = ProductDTO(
    id,
    name,
    price,
    description
)