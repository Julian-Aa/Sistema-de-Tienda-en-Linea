package com.eam.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;

import com.eam.models.User;

public interface IAUser extends JpaRepository<User, String>{

}
