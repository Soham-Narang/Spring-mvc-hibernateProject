package validation;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	
	public static boolean empty(String field) {
		
		return field==null || field.trim().length()==0;
	
	}
	
	public static boolean minLength(String field,int length) {
		
		return field==null || field.trim().length() < length;
	
	}
	
	public static boolean isValid(String regexPattern, String username) {
	
		String USERNAME_PATTERN =
            "^[a-zA-Z0-9]([._-](?![._-])|[a-zA-Z0-9]){3,18}[a-zA-Z0-9]$";

    	Pattern pattern = Pattern.compile(regexPattern);

        Matcher matcher = pattern.matcher(username);
        return matcher.matches();
        
    }
	
	

}
