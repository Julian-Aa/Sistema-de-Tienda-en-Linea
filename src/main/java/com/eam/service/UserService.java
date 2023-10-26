package com.eam.service;

import com.eam.models.User;
import com.eam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() { return userRepository.findAll();}

    public User findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }
    public User save(User user) {
        return userRepository.save(user);
    }

    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
    public User login(String email, String password) {
        User user = userRepository.getUserByEmail(email);
        if (user != null && user.getPassword().equals(password)) {
            System.out.println(user);
            return user;
        } else {
            return null;
        }
    }

    public boolean existsByEmail(String email) {
        return userRepository.existsByEmail(email);
    }

}
