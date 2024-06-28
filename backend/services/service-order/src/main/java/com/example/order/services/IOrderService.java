package com.example.order.services;
import com.example.order.entities.OrderEntity;
import java.util.List;
/**
 * Interface for the Order Service, which provides operations for managing order data.
 *
 * @author Mejda Sliman _ mejda.sliman@esprit.tn 2ALINFO3
 */
public interface IOrderService {

    public List<OrderEntity> getAllOrders();

    
    public OrderEntity getOrderById(Long id);

    /**
     * Create a new order with the specified data.
     *
     * @param orderEntity A OrderEntity object containing the data for the new order.
     * @return A OrderEntity object representing the newly created order.
     */
    public OrderEntity createOrder(OrderEntity orderEntity);

    /**
     * Update an existing order with the specified data.
     *
     * @param id          The ID of the order to update.
     * @param orderEntity A OrderEntity object containing the updated data for the order.
     * @return A OrderEntity object representing the updated order, or null if the order was not found.
     */
    public OrderEntity updateOrder(Long id, OrderEntity orderEntity);

    /**
     * Delete an order with the specified ID.
     *
     * @param id The ID of the order to delete.
     */
    public void deleteOrder(Long id);


}
