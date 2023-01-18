package com.bookdetails;

import java.util.ArrayList;
import java.util.Scanner;

public class Library {
	
	static Scanner sc = new Scanner(System.in);
	public static String LoadBookDetails(int bookid)
	{
		
		ArrayList<book> alb = new ArrayList<book>();
		
		alb.add( new book("Shakesphere",(new Author("Saravanan",23,"Male")), "230", 230, 3008));
		alb.add( new book("Phoneix",(new Author("Abdulkalam",34,"Male")), "240", 230, 4008));
		alb.add( new book("SacratHeart",(new Author("Tim",20,"Female")), "30", 200, 108));
		alb.add( new book("Black Rose",(new Author("Priya",23,"Female")), "100", 9030, 9008));
		alb.add( new book("Strength",(new Author("Prithivi",25,"Male")), "56", 30, 300));
		
		
		if(bookid<=alb.size())
		{
			System.out.println(alb.get(bookid).getBookname()+"   "+alb.get(bookid).getAuthor().getName());
			
		}
		else
		{
			System.out.println("Sorry We dont have any books from the library for your option!");
		}
		return null;
	}
	
	public static void library()
	{
		
		System.out.println("Welcome to Book Library! PLease choose any book number between 0 -4 for a details on a Books ");
		System.out.print("Please enter the Book Id :");
		int bookid=sc.nextInt();
		System.out.println("Book Details of the Book-Id is :"+bookid);
		LoadBookDetails(bookid);
		System.out.println("Thanks for Choosing the Book");
		System.out.println("\n Please press 1 to continue OR 2 for Exit the System!");
		int id =sc.nextInt();
		reload(id);
	}
	public static String reload(int did)
	{
		if(did==1)
		{
			library();
		}
		else
		{
			System.out.println("Thank You! Welcome Again Have a good day");
			System.exit(0);			
		}
		return null;
		
	}
	public static void main(String args[]) {		
		
	library();
	
	}

}
