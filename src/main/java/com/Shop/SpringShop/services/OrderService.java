package com.Shop.SpringShop.services;

import com.Shop.SpringShop.entities.Order;
import com.Shop.SpringShop.entities.User;
import com.Shop.SpringShop.repositories.OrderRepository;
import com.Shop.SpringShop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderService {
    @Autowired
    private OrderRepository orderRepository;

    public List<Order> findAll() {
        return orderRepository.findAll();
    }

    public Order findById(long id) {
        Optional<Order> order = orderRepository.findById(id);
        return order.get();
    }

}
