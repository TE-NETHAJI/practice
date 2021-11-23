package com.company.module.loginOperation;

import com.company.custom.exceprion.InvalidCrendentialsException;

public class LoginTest {
	
	public void loggin(String user, String password) {
		if(user.equalsIgnoreCase("admin")) {
			if(password.equalsIgnoreCase("admin123")) {
				System.out.println("logged In Sucessfully");
			}
			else {
				throw new InvalidCrendentialsException("wrong password");
			}
		}else {
			throw new InvalidCrendentialsException("wrong credentials");
		}
		
	}

}
