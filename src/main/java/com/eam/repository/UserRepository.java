package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    User getUserByEmail(String email);
    List<User> findAll();

    User save(User user);

    void deleteById(Long id);

}
