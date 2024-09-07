package accenture;

import java.util.regex.Pattern;

public class password_check {

	public static void main(String[] args) {
		String pass="xYz123";
		Pattern digit=Pattern.compile("[0-9]");
		Pattern lowercase=Pattern.compile("[a-z]");
		Pattern uppercase=Pattern.compile("[A-Z]");
		boolean check=true;
		if(pass.length()<6 || pass.contains(" ") 
				|| pass.contains("/")){
			check=false;
		}
		if(!digit.matcher(pass).find() || 
				!lowercase.matcher(pass).find() || 
				!uppercase.matcher(pass).find()) {
			check =false;
		}
		if(check) {
			System.out.println("Valid Password");
		}
		else {
			System.out.println("Invalid password");
		}
	}

}
