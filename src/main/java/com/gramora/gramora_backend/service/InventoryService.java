package com.gramora.gramora_backend.service;

import com.gramora.gramora_backend.model.Inventory;
import com.gramora.gramora_backend.repository.InventoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

    private final InventoryRepository inventoryRepository;

    public InventoryService(InventoryRepository inventoryRepository) {
        this.inventoryRepository = inventoryRepository;
    }

    public Inventory addInventory(Inventory inventory) {
        return inventoryRepository.save(inventory);
    }

    public List<Inventory> getAllInventory() {
        return inventoryRepository.findAll();
    }

    public Inventory getInventoryById(Long id) {
        return inventoryRepository.findById(id).orElse(null);
    }

    public Inventory updateInventory(Long id, Inventory inventory) {
        Inventory existingInventory =
                inventoryRepository.findById(id).orElse(null);

        if (existingInventory != null) {
            existingInventory.setProductId(inventory.getProductId());
            existingInventory.setCurrentStock(inventory.getCurrentStock());
            existingInventory.setMinimumStock(inventory.getMinimumStock());

            return inventoryRepository.save(existingInventory);
        }

        return null;
    }

    public void deleteInventory(Long id) {
        inventoryRepository.deleteById(id);
    }
}