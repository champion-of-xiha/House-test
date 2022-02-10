package com.house.controller;

import java.io.IOException;
import java.nio.file.attribute.GroupPrincipal;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.house.eneities.User;
import com.house.service.userService;

@Controller
@RequestMapping("/userController")
public class userController {
	@Autowired
	private userService userService;
	@RequestMapping("/InsertUser")
	public String InsertUser() {
		System.out.println("requestmapping");
		User user=new User("tzy", 18);
		userService.InsertUser(user);
		return "NewFile";
	} 
	
}
