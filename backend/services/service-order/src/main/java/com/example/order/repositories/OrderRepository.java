package com.example.order.repositories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.order.entities.OrderEntity;

import java.util.Optional;

@Repository
public interface OrderRepository extends JpaRepository<OrderEntity, Long> {
   OrderEntity findByNameAndPrice(String name, String price);

}
