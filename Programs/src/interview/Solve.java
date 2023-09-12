package interview;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solve {
	public static Boolean isPalidrome(String s) {
		
		int i=0;
		int j=s.length()-1;
		
		
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				
				return false;
			}
			i++;
			j--;
		}
		
		
		
		
		return true;
	}
	
	  public static void main(String[] args) {
		  

		  
		String s="MOMy";
		
		if(isPalidrome(s)==true) {
			System.out.println("Is Palindrome");
			
			
		}
		else {
			System.out.println("Is not Palindrome");
		}
		  
		  
	  }
}
