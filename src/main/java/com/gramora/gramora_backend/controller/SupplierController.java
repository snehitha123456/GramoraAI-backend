package com.gramora.gramora_backend.controller;

import com.gramora.gramora_backend.model.Supplier;
import com.gramora.gramora_backend.service.SupplierService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/suppliers")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    // Add Supplier
    @PostMapping
    public Supplier addSupplier(@RequestBody Supplier supplier) {
        return supplierService.addSupplier(supplier);
    }

    // Get All Suppliers
    @GetMapping
    public List<Supplier> getAllSuppliers() {
        return supplierService.getAllSuppliers();
    }

    // Get Supplier By ID
    @GetMapping("/{id}")
    public Supplier getSupplierById(@PathVariable Long id) {
        return supplierService.getSupplierById(id);
    }

    // Update Supplier
    @PutMapping("/{id}")
    public Supplier updateSupplier(
            @PathVariable Long id,
            @RequestBody Supplier supplier) {

        return supplierService.updateSupplier(id, supplier);
    }

    // Delete Supplier
    @DeleteMapping("/{id}")
    public String deleteSupplier(@PathVariable Long id) {

        supplierService.deleteSupplier(id);

        return "Supplier deleted successfully";
    }
}