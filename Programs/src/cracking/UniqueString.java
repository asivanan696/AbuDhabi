package cracking;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        System.out.println("Enter any string to verify it's unique");
	        String a=sc.next();
	       char b[]= a.toCharArray();
	        
	        Set<Character> s= new HashSet<Character>();
	        
	        for(char c:b) {
	        	
	        	if(!s.add(c)) {
	        		
	        		System.out.println("Duplicate is present");
	        		return;
	        	}
	        	
	        }
	  System.out.println("No duplicates");        
	        
	}

}
