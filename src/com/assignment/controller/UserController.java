package com.assignment.controller;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.assignment.bo.UserBO;
import com.assignment.vo.User;

@Controller
public class UserController {
	
	@Autowired
	UserBO userBO;
	
	@RequestMapping("/userRegistraion.do")
	public String entry(Model model) {
		
		System.out.println("UserController :entry: Start ");
		
		User user = new User();
		model.addAttribute("theuser", user);
		
		System.out.println("UserController :entry: end");
		
		return "personalInfo";
	} 
	
	@RequestMapping("processPersonalDetails.do")
	public String validatePersonalForm(@Valid @ModelAttribute("theuser") User user, BindingResult result, HttpSession session) {
		
		System.out.println("UserController :validatePersonalForm: Start ");
		
		System.out.println("binding result:" + result);
		
		System.out.println("field error(firstName):" + result.getFieldError("firstName"));
		System.out.println("field error(lastName):" + result.getFieldError("lastName"));
		System.out.println("field error(middleName):" + result.getFieldError("middleName"));
		
		System.out.println("user" + user);
		session.setAttribute("user", user);
		
		//no error
		if(result.getFieldError("firstName") == null && result.getFieldError("lastName") == null && result.getFieldError("middleName") == null)
			return "contactInfo";
		
		System.out.println("UserController :validatePersonalForm: end");
		
		return "personalInfo";
	} 
	
	@RequestMapping("processAccountDetails.do")
	public String validateAccountForm(@Valid @ModelAttribute("theuser") User user, BindingResult result, HttpSession session) {
		
		System.out.println("UserController :validateAccountForm: Start ");
		
		System.out.println("user" + user);
		
		//no error
		if(result.getFieldError("address") == null && result.getFieldError("city") == null && result.getFieldError("state") == null && result.getFieldError("country") == null && result.getFieldError("phoneNumber") == null)
		{
			
			User theUser = (User) session.getAttribute("user");
			user.setFirstName(theUser.getFirstName());
			user.setLastName(theUser.getLastName());
			user.setMiddleName(theUser.getMiddleName());
			
			System.out.println("user after changing" + user);
			session.setAttribute("user", user);
			
			return "bankInfo";
		}
		
		//if error - return accountinfo 
		System.out.println("UserController :validateAccountForm: end");
		
		return "contactInfo";
	}
	
	@RequestMapping("processBankDetails.do")
	public String validateBankForm(@ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		
		System.out.println("UserController :validateBankForm: Start ");
		
		System.out.println("user" + user);
		session.setAttribute("contactinfo", user);
		
		//no error
		if(result.getFieldError("bankName") == null && result.getFieldError("account") == null && result.getFieldError("ssn") == null) {
			
			User theUser = (User) session.getAttribute("user");
			theUser.setBankName(user.getBankName());
			theUser.setAccount(user.getAccount());
			theUser.setSsn(user.getSsn());
			
			System.out.println("user after changing" + theUser);
			session.setAttribute("user", theUser);
			
			
			userBO.addUser(theUser);
			
			return "success";
			
		}
			
		System.out.println("UserDAOImpl :validateBankForm: end");	
		
		//if error - return accountinfo  
		return "bankInfo";
	}
	
}
