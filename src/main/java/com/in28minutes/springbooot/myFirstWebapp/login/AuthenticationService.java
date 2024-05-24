package com.in28minutes.springbooot.myFirstWebapp.login;

import org.springframework.stereotype.Component;

@Component
public class AuthenticationService 
{
	public boolean authenticate(String name,String password)
	{
		boolean validUserName=name.equalsIgnoreCase("Deep");
		boolean validUserPassword=password.equalsIgnoreCase("pass");
		
		return validUserName&&validUserPassword;
	}
}
