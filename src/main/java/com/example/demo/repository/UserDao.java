package com.example.demo.repository;

import java.util.List;

import com.example.demo.pojo.entity.User;

public interface UserDao
{
	public abstract List<User> selectAllUsers();
	public abstract int insertUser(User user);
}
