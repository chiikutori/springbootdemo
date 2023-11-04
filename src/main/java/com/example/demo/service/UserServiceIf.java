package com.example.demo.service;

import java.util.List;


import com.example.demo.pojo.entity.User;

public interface UserServiceIf
{
	public abstract List<User> getAllUsers();
	public abstract int addUserToMysql(User user);
}
