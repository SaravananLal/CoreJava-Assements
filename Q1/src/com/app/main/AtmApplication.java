package com.app.main;

import java.math.BigDecimal;
import java.util.Scanner;

public class AtmApplication {
	
	static AtmCall atcal;
public static void main(String args[])
	{
	    System.out.println("Welcome to LTIMINDTREE ATM");
	    atcal= new AtmCall();
	    atcal.loadcustomer();
	    
	}

}
