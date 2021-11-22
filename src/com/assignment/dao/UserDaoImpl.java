package com.assignment.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import com.apex.user.util.HibernateUtil;
import com.assignment.vo.User;

//import dbaccess.MYSQLDBAccess;

@Repository
public class UserDaoImpl implements UserDAO {

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		
		System.out.println("UserDAOImpl :addUser: Start ");
		
		/*
		 * try { MYSQLDBAccess.createUser(user); } catch (Exception e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction tx =  session.beginTransaction();
		session.save(user);
		tx.commit();
		session.close();
		
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
