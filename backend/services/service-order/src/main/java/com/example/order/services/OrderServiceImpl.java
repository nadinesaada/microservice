package com.example.order.services;
import jakarta.ws.rs.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.order.entities.OrderEntity;
import com.example.order.repositories.OrderRepository;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements IOrderService {
   
    @Autowired
    private OrderRepository orderRepository;
    
    @Override
    public List<OrderEntity> getAllOrders() {
        return orderRepository.findAll();
    }
    /**
     * Retrieves an order entity from the database based on its ID.
     *
     * @param id The ID of the order to retrieve.
     * @return The order entity with the specified ID, or null if no such order exists.
     */
    @Override
    public OrderEntity getOrderById(Long id) {
        return orderRepository.findById(id).orElse(null);
    }
    /**
     * Creates a new order entity in the database.
     *
     * @param orderEntity The order entity to create.
     * @return The created order entity.
     */
    @Override
    public OrderEntity createOrder(OrderEntity orderEntity) {
        orderEntity.setCode(orderEntity.getName() + "-" + orderEntity.getPrice() + "-" + orderEntity.getQuantity()+ "-" + orderEntity.getAvailability());
        return orderRepository.save(orderEntity);
    }
    /**
     * Updates an existing order entity in the database.
     *
     * @param id         The ID of the order to update.
     * @param orderEntity The updated order entity.
     * @return The updated order entity, with a hashed password.
     */
    @Override
    public OrderEntity updateOrder(Long id, OrderEntity orderEntity) {
        OrderEntity existingOrderEntity = orderRepository.findById(id).orElse(null);
        if (existingOrderEntity != null) {
            existingOrderEntity.setName(orderEntity.getName());
            existingOrderEntity.setPrice(orderEntity.getPrice());
            existingOrderEntity.setQuantity(orderEntity.getQuantity());
            existingOrderEntity.setCode(orderEntity.getName() + "-" + orderEntity.getPrice() + "-" + orderEntity.getQuantity());
            return orderRepository.save(existingOrderEntity);
        }
        return null;
    }

    /**
     * Deletes an order entity from the database based on its ID.
     *
     * @param id The ID of the order to delete.
     */
    @Override
    public void deleteOrder(Long id) {
        orderRepository.deleteById(id);
    }


}
