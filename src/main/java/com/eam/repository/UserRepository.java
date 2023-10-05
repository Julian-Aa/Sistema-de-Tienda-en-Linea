package com.eam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUserName(String userName);
    boolean existsByEmail(String email);

}
