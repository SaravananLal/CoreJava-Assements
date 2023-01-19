package com.MainExecution;

import java.util.Scanner;

public class MainClassExecution {
	
	UserDefException userDefException;
	public String CandidateEvaluation(int age, String edu) throws Exception
	{
		String message;
	
		if(age<21 || age>60)
		{
			message=userDefException.AgeValidator();
			return message;
		}
		if(edu.equalsIgnoreCase("null")||edu!=("btech")||edu.isEmpty())
		{
			message=userDefException.EducationValidator();	
			return message;
		}
		
		else
		{
			System.out.println("Welcome for Successful Candidature Validation");
			
			message= "The candidate Details are :"+age +" ;"+edu;
			return message;
		}
		
		 
		
	}
	
	public static void main(String args[]) throws Exception
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Weclome for LTIMINDTREE Candidate Evaluation!");
		System.out.println("Please enter your age!");
		int age = sc.nextInt();
		System.out.println("Please enter your education qualification");
		String edu = sc.next();
		MainClassExecution mnc1= new MainClassExecution();
		System.out.println(mnc1.CandidateEvaluation(age, "edu"));
		
	}

}
