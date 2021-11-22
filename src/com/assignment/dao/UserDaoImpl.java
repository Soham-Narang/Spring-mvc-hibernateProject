package com.assignment.dao;

import org.springframework.stereotype.Controller;

import com.assignment.vo.User;

import dbaccess.MYSQLDBAccess;

@Controller
public class UserDaoImpl implements UserDAO {

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		
		System.out.println("UserDAOImpl :addUser: Start ");
		
		try {
			MYSQLDBAccess.createUser(user);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("UserDAOImpl :addUser: end");	

	}

	@Override
	public void updateUser(User user) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteUser(User user) {
		// TODO Auto-generated method stub

	}

}
