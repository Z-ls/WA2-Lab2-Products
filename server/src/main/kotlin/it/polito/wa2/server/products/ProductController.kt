package it.polito.wa2.server.products

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController

@RestController
class ProductController(private val productService: ProductService) {

    @GetMapping("/API/products")
    fun getAllProducts(): List<ProductDTO> {
        return productService.getAllProducts()
    }

    @GetMapping("/API/product/{id}")
    fun getProduct(@PathVariable id: Long): ProductDTO? {
        return productService.getProduct(id)
    }

}