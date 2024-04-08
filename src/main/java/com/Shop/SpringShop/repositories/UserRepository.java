package com.Shop.SpringShop.repositories;

import com.Shop.SpringShop.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
