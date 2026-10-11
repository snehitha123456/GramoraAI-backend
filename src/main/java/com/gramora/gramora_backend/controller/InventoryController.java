package com.gramora.gramora_backend.controller;

import com.gramora.gramora_backend.model.Inventory;
import com.gramora.gramora_backend.service.InventoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    // Add Inventory
    @PostMapping
    public Inventory addInventory(@RequestBody Inventory inventory) {
        return inventoryService.addInventory(inventory);
    }

    // Get All Inventory
    @GetMapping
    public List<Inventory> getAllInventory() {
        return inventoryService.getAllInventory();
    }

    // Get Inventory By ID
    @GetMapping("/{id}")
    public Inventory getInventoryById(@PathVariable Long id) {
        return inventoryService.getInventoryById(id);
    }

    // Update Inventory
    @PutMapping("/{id}")
    public Inventory updateInventory(
            @PathVariable Long id,
            @RequestBody Inventory inventory) {

        return inventoryService.updateInventory(id, inventory);
    }

    // Delete Inventory
    @DeleteMapping("/{id}")
    public String deleteInventory(@PathVariable Long id) {

        inventoryService.deleteInventory(id);

        return "Inventory deleted successfully";
    }
}