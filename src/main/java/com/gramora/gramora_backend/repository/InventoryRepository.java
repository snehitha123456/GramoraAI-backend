package com.gramora.gramora_backend.repository;

import com.gramora.gramora_backend.model.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InventoryRepository extends JpaRepository<Inventory, Long> {

}