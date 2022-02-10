package com.house.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.house.dao.userMapper;
import com.house.eneities.User;

@Service
public class userService {
	@Autowired
	private userMapper userMapper;
	
	public void InsertUser(User user) {
		System.out.println("service");
		userMapper.InsertUser(user);
		System.out.println("mapper");
	}
}
