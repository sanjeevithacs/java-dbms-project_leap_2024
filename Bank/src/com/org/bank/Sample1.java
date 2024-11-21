package com.org.bank;
import java.io.*;
import java.util.*;
public class Sample1 {

	public static void main(String[] args) {
		int i,j;
		for(i=1;i<=5;i++) {
			for(j=i;j<i+5;j+=1) {
				System.out.print(j+ " ");
			}
			System.out.println(" ");
		}

	}

}
