package com.Shop.SpringShop.repositories;

import com.Shop.SpringShop.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
