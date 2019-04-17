package com.kang.service.impl;

import org.springframework.transaction.annotation.Transactional;

import com.kang.dao.UserDao;
import com.kang.domin.User;
import com.kang.service.UserService;

//实现自动提交事务
@Transactional
public class UserServiceImpl implements UserService{
	
	
	//实现setter注入
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	
	
	@Override
	public User login(User user) {
		
		return userDao.login(user);
	}
	
	

}
