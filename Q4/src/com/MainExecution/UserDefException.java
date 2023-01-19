package com.MainExecution;

public class UserDefException extends Exception {
	

	public static String AgeValidator() throws Exception
	{
		
		throw new Exception("Age is Not Valid ! Please try again with valid input.");
	}
	
	public static String EducationValidator() throws Exception
	{
		throw new Exception("Education Qualification is Not Valid ! Please try again with valid input.");
	}

}
