package com.gramora.gramora_backend.repository;

import com.gramora.gramora_backend.model.Cart;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart, Long> {

}