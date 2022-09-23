package junit;

public class Login {
	
public String username;
public String password;
/**
 * @return the username
 */
public String getUsername() {
	return username;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * @return the password
 */
public String getPassword() {
	return password;
}
/**
 * @param password the password to set
 */
public void setPassword(String password) {
	this.password = password;
}


boolean checkLogin() {
	 if(username.equals("admin") || password.equals("admin123"))
		 
		 return true;
	 
	 
	 return false;
}



}
