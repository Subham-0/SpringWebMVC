package com.springwebmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springwebmvc.dao.UserDao;
import com.springwebmvc.entity.User;

@Service
public class UserServiceImp implements UserService{
	
	@Autowired
	private UserDao dao;

	@Override
	public int registerUser(User user) {
		int i = dao.saveUser(user);
		return i;
	}

}
