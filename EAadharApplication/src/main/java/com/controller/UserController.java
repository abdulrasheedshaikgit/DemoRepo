package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.UserEntity;
import com.repo.UserRepo;

@RestController
public class UserController {
@Autowired
UserRepo ur;

@PostMapping("/register")
public String registerUser(@RequestBody UserEntity user)
{
	ur.save(user);
	return "User Registered Successfully";
}




}
