package com.Shop.SpringShop.services;

import com.Shop.SpringShop.entities.Product;
import com.Shop.SpringShop.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public Product findById(long id) {
        Optional<Product> product = productRepository.findById(id);
        return product.get();
    }

}
