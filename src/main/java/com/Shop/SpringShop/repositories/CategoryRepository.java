package com.Shop.SpringShop.repositories;

import com.Shop.SpringShop.entities.Category;
import com.Shop.SpringShop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
