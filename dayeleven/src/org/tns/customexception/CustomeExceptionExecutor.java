package org.tns.customexception;

import java.util.Scanner;

public class CustomeExceptionExecutor {

	public static void main(String[] args) throws LoginCredentials 
	{
		Scanner s=new Scanner(System.in);
		String userID=s.nextLine();
		String password=s.nextLine();
		
		try {
			if(userID.equals("abc123") && password.equals("pass123"))
			{
				System.out.println("Credential are matched");
			}
			else 
			{
				throw new LoginCredentials("invalid");
			}
		}
		catch(LoginCredentials e)
		{
			System.out.println("custom Exception");
		}
		
	}
}
