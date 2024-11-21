package com.org.bank;
import java.io.*;
import java.util.*;

public class Sample {

	public static void main(String[] args) {
		int a,ch ;
		String n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name: ");
		n = sc.nextLine();
		System.out.println("Enter your age:");
		a= sc.nextInt();
	
		if(a>18) {
			if(a>50) {
				ch = 1;
			}else {
				ch = 2;
			}
		}
		else {
			 ch = 3;
		}
		
		
		switch(ch) {
		case 1:
			System.out.println(n+" ,you are a senior citizen!!");
			break;
			
		case 2:
			System.out.println(n+" ,is eligible to vote...");
			break;
			
		case 3:
			System.out.println(n+" ,is not eligible to vote:)");
			break;
		}	
	}
}