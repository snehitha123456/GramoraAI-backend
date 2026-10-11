package com.gramora.gramora_backend.service;

import com.gramora.gramora_backend.model.Order;
import com.gramora.gramora_backend.repository.OrderRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    private final OrderRepository orderRepository;

    public OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    // Create Order
    
public Order createOrder(Order order) {

    // Free delivery for orders ₹99 or above
if (order.getSubtotal() >= 99) {
    order.setDeliveryCharge(0.0);
} else {
    order.setDeliveryCharge(10.0);
}

    // Calculate total amount
    order.setTotalAmount(
        order.getSubtotal() + order.getDeliveryCharge()
    );

    // Set initial order status
    order.setStatus("ORDER_PLACED");

    return orderRepository.save(order);
}

    // Get all orders
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    // Get order by ID
    public Order getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }

    // Update order status
    public Order updateOrderStatus(Long id, String status) {

        Order existingOrder =
                orderRepository.findById(id).orElse(null);

        if (existingOrder != null) {
            existingOrder.setStatus(status);
            return orderRepository.save(existingOrder);
        }

        return null;
    }

    // Delete order
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }
}