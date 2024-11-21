package com.org.bank;
import java.io.*;
import java.util.*;


public class Bank2 {

    public static void main(String[] args) {
        
    	System.out.println("1.create an account \n 2.List of user");
    	Scanner sc = new Scanner(System.in);
    	int ch = sc.nextInt();
    	if(ch == 1) {
    		System.out.println("Enter Name:");
            String name = sc.nextLine();
            
            System.out.println("Enter Account Number:");
            String accnum = sc.nextLine();
            
            System.out.println("Enter Amount:");
            int amt = sc.nextInt();
            
            HashMap<String,Object> values = new HashMap<>();
            values.put("name",name);
            values.put("account",accnum);
            values.put("amount",amt);
            
            
            ArrayList<Object> al = new ArrayList<>();
            al.add(values);
            
            System.out.println(al);
    	}
    	
    }
}
