package it.polito.wa2.server.products

import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class ProductServiceImp(private val productRepository: ProductRepository) :
    ProductService {
    override fun getAllProducts(): List<ProductDTO> {
        return productRepository.findAll().map {
            it.toDTO()
        }
    }

    override fun getProduct(id: Long): ProductDTO? {
        return productRepository.findByIdOrNull(id)?.toDTO()
    }
}