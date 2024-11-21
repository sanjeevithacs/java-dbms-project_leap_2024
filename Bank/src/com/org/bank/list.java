package com.org.bank;
import java.io.*;
import java.util.*;

public class list {

	public static void main(String[] args) {
		 LinkedList<Integer> l = new LinkedList<>();
	        l.add(1);
	        l.add(2);
	        l.add(2);
	        l.add(3);
	        l.add(3);
	        l.add(5);
	        System.out.println("List: " + l);

	        Map<Integer, Integer> m = new HashMap<>();
	        for (int i : l) {
	            m.put(i, m.getOrDefault(i,0)+1);
	        }
	        int dCount=0;
	        for (int count:m.values()) {
	            if (count>1) {
	                dCount++;
	            }
	        }
	        System.out.println("Number of duplicate elements: " + dCount);

	}

}
// thread - light weight software,run independently(i.e) doesn't affect main program
 