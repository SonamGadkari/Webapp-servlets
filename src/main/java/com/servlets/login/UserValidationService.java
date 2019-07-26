package com.servlets.login;

public class UserValidationService {
	public boolean isvalidUser(String name,String password)
	{
		if(!name.contains("[0-9]+") && password.contains("0"))
		{
			return true;
		}
		return false;	
				
	}

}
