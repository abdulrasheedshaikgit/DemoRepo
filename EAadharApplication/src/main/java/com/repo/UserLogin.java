package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entities.UserLoginEntity;

public interface UserLogin extends JpaRepository<UserLoginEntity, Integer>{

}
