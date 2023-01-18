package com.app.main;

import java.math.BigDecimal;
import java.util.Scanner;
/*
 * Saravanan 
 */
public class AtmCall {
	
	static Scanner sc = new Scanner(System.in);
	static Account acc;
	public void loadcustomer()
	{
		acc= new Account();
		System.out.println("Please Enter your Account Number");
		String Accnumber=sc.next();
		acc.setAccnum(Accnumber);
		System.out.println("Please Enter your Name ");
		String name=sc.next();
		acc.setName(name);		
		int bamount = (int) (2500+Math.random());
		acc.setBamnt(bamount);
		menu();
		
	}
	public void menu()
	{
		System.out.println("Please Enter your option from the menu to perform transaction ");
		System.out.println("Please select the option \n1.Amount Deposit \n2.Amount_WithDrawal \n3.MiniStatement \n4.Balance Enquiry \n5.Exit");
		
		String inp =sc.next();
		if(inp!=null)
		{
			customerdetails(inp);
		}
		else
		{
			System.out.println("Sorry Our System is not Avail please try latter");
		}
	}
	
	public String customerdetails(String inp)
	{
		switch(inp)
		{
		case "1": 
		System.out.println("Welcome     "+acc.getName());
		System.out.println("Please Deposit your amount");
		BigDecimal depamount =sc.nextBigDecimal();
		System.out.println("Please Press 1 to confirm and continue the transaction OR Press 2 to Cancel Transaction");
		String conf = sc.next();
		if(conf.equals("1"))
		{
		
		System.out.println("Your Depositing Amount is "+depamount);
		System.out.println("Available balance amount is"+acc.getBamnt()+depamount);
		
		System.out.println("Your amount has been deposited successfully");
		}
		else if(conf.equals("2"))
		{
			System.out.println("SOrry Your Transaction has been Cancelled");
			}
		else
		{
			System.out.println("SOrry for Inconvenience this ATM is Out of Service!");
		}
		break;
		
		case "2": System.out.println("Welcome to LTIMintree ATMS "+acc.getName());
		System.out.println("Please enter the amount to withdraw");
		double withdrawamount =sc.nextDouble();
		if(withdrawamount<acc.getBamnt())
		{
			System.out.println("Your Amount has been withdrawn successfully"+(acc.getBamnt()-withdrawamount)+"\n Thank You for Chhoosing us");
			
		}
		else
		{
			System.out.println("SOrry your Transaction has been Aborted Since there is insuffecient fund.");
		}
		break;
		
		case "3":
			System.out.println("Available Amount is:"+acc.getBamnt()+"-Rs");
		
			break;
		default:
			System.out.println("Thanks for Choosing Us!");
			System.exit(0);
		}
		
	
		return null;
	}
	
	

}
