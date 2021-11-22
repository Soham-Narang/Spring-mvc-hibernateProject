package com.assignment.bo;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.assignment.dao.UserDAO;
import com.assignment.vo.User;

import validation.InfoValidation;

@Service
public class UserBOImpl implements UserBO {
	
//	@Autowired
	InfoValidation validation = new InfoValidation();
	
	@Autowired
	UserDAO userDao;
	
	@Override
	public String processPersonalInfo(User user) {
		
		System.out.println("UserBOImpl :processPersonalInfo: Start ");		
		
		StringBuffer allMessages = new StringBuffer();
		
		String errorMsg = "";
		
		validation.validateFirstName(user.getFirstName());

		errorMsg = validation.validateFirstName(user.getFirstName());
//		System.out.println("error msg string after calling first name:-" + errorMsg);
		allMessages.append(errorMsg);
//		System.out.println("allMessages-" + errorMsg);
		
		errorMsg = validation.validateLastName(user.getLastName());
//		System.out.println("error msg string after calling last name:-" + errorMsg);
		allMessages.append(errorMsg);
//		System.out.println("allMessages-" + errorMsg);
////		
		errorMsg = validation.validateMiddleName(user.getMiddleName());
//		System.out.println("error msg string after calling middle name:-" + errorMsg);
		allMessages.append(errorMsg);
//		System.out.println("allMessages-" + errorMsg);
//		
		System.out.println("UserBOImpl :processPersonalInfo: end");
		
		return allMessages.toString();
	}

	@Override
	public String processContactInfo(User user) {
		
		System.out.println("UserBOImpl :processContactInfo: Start ");
		
		StringBuffer allMessages = new StringBuffer();
		
		String errorMsg = "";
		
		//address city state country phoneNo
		errorMsg = validation.validateAddress(user.getAddress());
		System.out.println("error msg string after calling first name:-" + errorMsg);
		allMessages.append(errorMsg);
		System.out.println("allMessages-" + errorMsg);
		
		errorMsg = validation.validateCity(user.getCity());
		System.out.println("error msg string after calling last name:-" + errorMsg);
		allMessages.append(errorMsg);
		System.out.println("allMessages-" + errorMsg);
		
		errorMsg = validation.validateState(user.getState());
		System.out.println("error msg string after calling middle name:-" + errorMsg);
		allMessages.append(errorMsg);
		System.out.println("allMessages-" + errorMsg);
		
		errorMsg = validation.validateCountry(user.getCountry());
		System.out.println("error msg string after calling middle name:-" + errorMsg);
		allMessages.append(errorMsg);
		System.out.println("allMessages-" + errorMsg);
		
		errorMsg = validation.validatePhoneNumber(user.getPhoneNumber());
		System.out.println("error msg string after calling middle name:-" + errorMsg);
		allMessages.append(errorMsg);
		System.out.println("allMessages-" + errorMsg);
		
		System.out.println("UserBOImpl :processContactInfo: end");
		
		return allMessages.toString();
	
	}

	@Override
	public String processBankInfo(User user) {

		System.out.println("UserBOImpl :processBankInfo: Start ");

		System.out.println("UserBOImpl :processBankInfo: end");

		return "";
	}

	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return null;
	}

//	@Transactional
	public void addUser(User user) {
		
		System.out.println("UserBOImpl :addUser: Start ");
		
		userDao.addUser(user);
		
		System.out.println("UserBOImpl :addUser: end");
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
