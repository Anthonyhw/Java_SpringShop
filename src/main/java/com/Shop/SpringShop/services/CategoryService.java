package com.Shop.SpringShop.services;

import com.Shop.SpringShop.entities.Category;
import com.Shop.SpringShop.entities.User;
import com.Shop.SpringShop.repositories.CategoryRepository;
import com.Shop.SpringShop.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
    private CategoryRepository categoryRepository;

    public List<Category> findAll() {
        return categoryRepository.findAll();
    }

    public Category findById(long id) {
        Optional<Category> user = categoryRepository.findById(id);
        return user.get();
    }

}
