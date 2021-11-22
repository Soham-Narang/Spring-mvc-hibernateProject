package com.assignment.dao;

import com.assignment.vo.User;

public interface UserDAO {
	
	public User getUser(User user);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	
}
