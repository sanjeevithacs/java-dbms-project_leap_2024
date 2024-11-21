package com.org.bank;
import java.io.*;
import java.util.*;

public class BankDetails {


	public static void main(String[] args) {
		String user;
		int pin = 123 ;
		double bal = 5000;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter username:");
        user = sc.nextLine();
        System.out.println("Enter your pin: ");
        int p = sc.nextInt();
        
        if (pin == p ) {
        	
        	while(true) {
        		System.out.println("Enter your choice: \n 1.Balance Enquiry \n 2.Withdrawal \n 3.Deposite \n 4.User details \n 5.Exit");
        		int ch = sc.nextInt();
        		
        		switch(ch) {
        		case 1:
        			System.out.println("Your current balance is: Rs."+bal);
        			break;
        			
        		case 2:
        			double amt;
        			System.out.println("Enter amount to withdraw:");
        			amt = sc.nextDouble();
        			if(amt > bal) {
        				System.out.println("Insufficient Balance....\n Current Balance : Rs."+bal);
        			}else {
        				bal -= amt;
        				System.out.println("Balance after withdrawal : Rs."+bal);
        			}
        			break;
        			
        		case 3:
        			System.out.println("Enter amount to deposite: ");
        			amt = sc.nextDouble();
        			bal+=amt;
        			System.out.println("Balance after deposite: Rs."+bal);
        			break;
        			
        		case 4:
        			System.out.println("Username : "+user);
        			System.out.println("Pin : "+p);
        			break;
        			
        		case 5:
        			System.out.println("Exiting....");
        			System.exit(0);
        			break;
        			
        		default:
        			System.out.println("Wrong approach..");
        			
        		}
        	}
        }else {
        	System.out.println("Recheck your pin!!");
        }

	}

}
