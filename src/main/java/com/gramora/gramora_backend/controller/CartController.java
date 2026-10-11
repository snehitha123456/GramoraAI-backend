package com.gramora.gramora_backend.controller;

import com.gramora.gramora_backend.model.Cart;
import com.gramora.gramora_backend.service.CartService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    // Add item to cart
    @PostMapping
    public Cart addToCart(@RequestBody Cart cart) {
        return cartService.addToCart(cart);
    }

    // Get all cart items
    @GetMapping
    public List<Cart> getAllCartItems() {
        return cartService.getAllCartItems();
    }

    // Get cart item by ID
    @GetMapping("/{id}")
    public Cart getCartItemById(@PathVariable Long id) {
        return cartService.getCartItemById(id);
    }

    // Update cart item
    @PutMapping("/{id}")
    public Cart updateCartItem(
            @PathVariable Long id,
            @RequestBody Cart cart) {

        return cartService.updateCartItem(id, cart);
    }

    // Delete cart item
    @DeleteMapping("/{id}")
    public String deleteCartItem(@PathVariable Long id) {

        cartService.deleteCartItem(id);

        return "Cart item deleted successfully";
    }
}
