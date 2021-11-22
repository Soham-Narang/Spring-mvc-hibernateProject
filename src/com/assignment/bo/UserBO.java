package com.assignment.bo;

import com.assignment.vo.User;

public interface UserBO {
	
	public String processPersonalInfo(User user);
	public String processContactInfo(User user);
	public String processBankInfo(User user);
	
	public User getUser(User user);
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	
	
}
