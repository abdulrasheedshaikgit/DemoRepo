package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.entities.UserLoginEntity;
import com.repo.UserLogin;

@RestController
public class UserLoginController {
	@Autowired
	UserLogin ul;
	
	@PostMapping("userRegister")
	public String register(@RequestBody UserLoginEntity ule)
	{
		ul.save(ule);
		return "registered Successfully";
	}
	
	@GetMapping("login/{username}/{password}")
	public String loginCheck(@PathVariable String username,@PathVariable String password)
	{
		List<UserLoginEntity> l = ul.findAll();
		for(UserLoginEntity u:l)
		{
			if(u.getUsername().equals(username) && u.getPassword().equals(password))
			{
				return "Success";
				
			}
		}
		return "failure";
	}

}
