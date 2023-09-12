package collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class OcOfanycharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="My name is arunjith";
		
		 a=a.replaceAll(" ", "");
		char[] b=a.toCharArray();
		System.out.println("String is" +a);
		int count=0;
		
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for(char c:b) {
			if(map.containsKey(c)) {
				
				count=map.get(c);
				map.put(c, ++count);
				
			}
			else {
				map.put(c, 1);
			}
		}
			
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the letter to be searched");
			char d=sc.next().charAt(0);
			
			
				
				if(map.containsKey(d)) {
				
				System.out.println("The entered letter to be serached " +d + " repeated " + map.get(d) + " times");
			}
				else {
					System.out.println("Character is not found");
				}
			
			
		}	

	}



