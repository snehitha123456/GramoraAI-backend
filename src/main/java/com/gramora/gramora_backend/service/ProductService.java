package com.gramora.gramora_backend.service;

import com.gramora.gramora_backend.model.Product;
import com.gramora.gramora_backend.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product updateProduct(Long id, Product product) {
        Product existingProduct = productRepository.findById(id).orElse(null);

        if (existingProduct != null) {
            existingProduct.setName(product.getName());
            existingProduct.setCategory(product.getCategory());
            existingProduct.setPrice(product.getPrice());
            existingProduct.setUnit(product.getUnit());
            existingProduct.setStock(product.getStock());
            existingProduct.setMinimumStock(product.getMinimumStock());
            existingProduct.setExpiryDate(product.getExpiryDate());
            existingProduct.setImage(product.getImage());
            existingProduct.setDescription(product.getDescription());

            return productRepository.save(existingProduct);
        }

        return null;
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
