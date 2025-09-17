package com.springwebmvc.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springwebmvc.entity.User;

@Repository
public class UserDao {
	
	@Autowired
	private JdbcTemplate jdbcTemp;
	


	public int saveUser(User user) {
		String sql = "insert into user (name,email,password,valid,img) values(?,?,?,?,?)";
		int i = jdbcTemp.update(sql,user.getName(),user.getEmail(),user.getPassword(),user.getCheck(),user.getImage());
		return i;
	}
}
