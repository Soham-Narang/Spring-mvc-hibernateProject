package validation;

import java.beans.JavaBean;

//import dbaccess.Info;

@JavaBean
public class InfoValidation {
	
	public String validateFirstName(String firstName){
		
		String errorMsg = "";
		
		if(Validator.empty(firstName)) {
			errorMsg += "first name cannot be empty<br/>";
		}
		
		
		if(!Validator.isValid("^[a-zA-Z][\\w -]*", firstName)) {
			errorMsg += ": First Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid First Name<br/>";
		}
		
		
		if(Validator.minLength(firstName, 2)) {
			errorMsg += "first name less than 2 characters<br/>";
		}
		
		return errorMsg;
		
	}
	
	public String validateLastName(String lastName){
		
		String errorMsg = "";
		
		System.out.println("error msg while entrying lastname function" + errorMsg);
		
		if(Validator.empty(lastName)) {
			errorMsg += "last name cannot be empty<br/>";
		}
		
		if(!Validator.isValid("^[a-zA-Z][\\w -]*", lastName)) {
			errorMsg += ": : Last Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid Last Name.<br/>";
		}
		
		if(Validator.minLength(lastName, 2)) {
			errorMsg += "first name less than 2 characters<br/>";
		}
		
		System.out.println("returning error msg from last name function" + errorMsg);
		
		return errorMsg;
		
	}
	
	public String validateMiddleName(String middleName){
		
		String errorMsg = "";
		
		if(!Validator.isValid("^[a-zA-Z][\\w -]*", middleName)) {
			errorMsg += ": : Middle Name must start with a letter. It can contain only letters, numbers, and Spaces, Hyphens (-), Underscores (_). Please enter a valid middle Name.<br/>";
		}
		
		return errorMsg;
		
	}
	
	public String validateAddress(String address){
		
		String errorMsg = "";
		
		if(Validator.empty(address)) {
			errorMsg += "address cannot be empty<br/>";
		}
		
		return errorMsg;
		
	}
	
	public String validateCity(String city) {
		
		String errorMsg = "";
		
		if(Validator.empty(city)) {
			errorMsg += " Please specify City.<br/>";
		}
		
		if(!Validator.isValid("^[a-zA-Z][\\w -]*", city)) {
			errorMsg += " City can contain only letters, numbers, and Spaces, Hyphens (-), underscores (_). Please enter a valid City.<br/>";
		}
		
		return errorMsg;
	}
	
	public String validateState(String state) {
		
		String errorMsg = "";
		
		if(Validator.empty(state)) {
			errorMsg += " Please specify state.<br/>";
		}
		
		return errorMsg;
	}

	public String validateCountry(String country) {
		
		String errorMsg = "";
		
		if(Validator.empty(country)) {
			errorMsg += " Please specify country.<br/>";
		}
		
		return errorMsg;
	}
	
	public String validatePhoneNumber(String phoneNumber) {
		
		String errorMsg = "";
		
		if(!Validator.isValid("[0-9]{10}", phoneNumber)) {
			errorMsg += " : Phone number contains 10 digits. Please enter a valid Phone number<br/>";
		}
		
		return errorMsg;
	}
	
}
