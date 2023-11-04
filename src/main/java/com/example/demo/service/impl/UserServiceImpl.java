package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pojo.entity.User;
import com.example.demo.repository.UserDao;
import com.example.demo.service.UserServiceIf;

@Service
public class UserServiceImpl implements UserServiceIf
{
	@Autowired
	private UserDao userDao;

	@Override
	public List<User> getAllUsers()
	{
		return userDao.selectAllUsers();
	}

	@Override
	public int addUserToMysql(User user)
	{
		return userDao.insertUser(user);
	}

}
