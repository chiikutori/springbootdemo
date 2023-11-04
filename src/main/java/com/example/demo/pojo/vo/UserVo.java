package com.example.demo.pojo.vo;


import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class UserVo
{
	@Size(min=1,max=20,message = "invalid name")
	private String name;
	@Email
	@NotNull
	private String email;
	@NotNull
	private String contents;
	public UserVo()
	{
	}
	public UserVo(String name, String email, String contents)
	{
		this.name = name;
		this.email = email;
		this.contents = contents;
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
	
}
