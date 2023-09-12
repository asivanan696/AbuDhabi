package cracking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UniqueString2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string to verify it's unique");
        String a=sc.next();
        char b[]= a.toCharArray();

        Map<Character,Integer> m=new HashMap<>();

        for(char c:b) {
        	if(m.containsKey(c)) {
        		System.out.println("Duplicate is present");
        		return;
        	}

        	 m.put(c, 1);
        }

        System.out.println("No duplicates");
	}

}
