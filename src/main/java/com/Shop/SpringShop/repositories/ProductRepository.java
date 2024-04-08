package com.Shop.SpringShop.repositories;

import com.Shop.SpringShop.entities.Category;
import com.Shop.SpringShop.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
