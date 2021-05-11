package com.gec.demo;

public interface UserDao {
	
	//添加用户
	public void addUser();

	//用户登录
	public void login(String name,String password);
}
