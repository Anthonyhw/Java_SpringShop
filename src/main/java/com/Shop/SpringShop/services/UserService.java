package com.Shop.SpringShop.services;

import com.Shop.SpringShop.entities.User;
import com.Shop.SpringShop.repositories.UserRepository;
import com.Shop.SpringShop.services.exceptions.DatabaseException;
import com.Shop.SpringShop.services.exceptions.ResourceNotFoundException;
import jakarta.persistence.EntityNotFoundException;
import org.apache.catalina.webresources.EmptyResource;
import org.hibernate.exception.ConstraintViolationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }

    public User findById(long id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public User insert(User user) {
        return userRepository.save(user);
    }

    public void delete(long id) {
        try {
            if (userRepository.existsById(id)) {
                userRepository.deleteById(id);
            }else {
                throw new ResourceNotFoundException(id);
            }
        }catch (EmptyResultDataAccessException e ) {
            throw new ResourceNotFoundException(id);
        }catch (DataIntegrityViolationException e) {
            throw new DatabaseException(e.getMessage());
        }
    }

    public User update(Long id, User user) {
        try {
            User u = userRepository.getReferenceById(id);
            updateData(u, user);
            return userRepository.save(u);
        }catch (EntityNotFoundException e) {
            throw new ResourceNotFoundException(id);
        }
    }

    private void updateData(User u, User user) {
        u.setName(user.getName());
        u.setEmail(user.getEmail());
        u.setPhone(user.getPhone());
    }
}
