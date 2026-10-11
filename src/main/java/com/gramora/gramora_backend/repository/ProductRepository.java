package com.gramora.gramora_backend.repository;

import com.gramora.gramora_backend.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}