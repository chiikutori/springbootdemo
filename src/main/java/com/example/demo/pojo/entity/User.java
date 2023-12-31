package com.example.demo.pojo.entity;

import java.time.LocalDateTime;

public class User
{
	private int id;
	private String name;
	private String email;
	private String contents;
	private LocalDateTime created;
	
	public User()
	{
		
	}
	
	public User(int id, String name, String email, String contents, LocalDateTime created)
	{
		this.id = id;
		this.name = name;
		this.email = email;
		this.contents = contents;
		this.created = created;
	}

	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}
	public String getContents()
	{
		return contents;
	}
	public void setContents(String contents)
	{
		this.contents = contents;
	}
	public LocalDateTime getCreated()
	{
		return created;
	}
	public void setCreated(LocalDateTime created)
	{
		this.created = created;
	}
	
}
