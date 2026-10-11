package com.gramora.gramora_backend.service;

import com.gramora.gramora_backend.model.Cart;
import com.gramora.gramora_backend.repository.CartRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    // Add item to cart
    public Cart addToCart(Cart cart) {

        cart.setTotal(cart.getPrice() * cart.getQuantity());

        return cartRepository.save(cart);
    }

    // Get all cart items
    public List<Cart> getAllCartItems() {
        return cartRepository.findAll();
    }

    // Get cart item by ID
    public Cart getCartItemById(Long id) {
        return cartRepository.findById(id).orElse(null);
    }

    // Update cart item
    public Cart updateCartItem(Long id, Cart cart) {

        Cart existingCart =
                cartRepository.findById(id).orElse(null);

        if (existingCart != null) {

            existingCart.setUserId(cart.getUserId());
            existingCart.setProductId(cart.getProductId());
            existingCart.setQuantity(cart.getQuantity());
            existingCart.setPrice(cart.getPrice());

            existingCart.setTotal(
                    cart.getPrice() * cart.getQuantity()
            );

            return cartRepository.save(existingCart);
        }

        return null;
    }

    // Delete cart item
    public void deleteCartItem(Long id) {
        cartRepository.deleteById(id);
    }
}