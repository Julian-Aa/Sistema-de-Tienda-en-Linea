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

    public User finBy(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    public User save(User user) {
        return userRepository.save(user);
    }

    public void dele(Long id) {
        userRepository.deleteById(id);
    }
}
