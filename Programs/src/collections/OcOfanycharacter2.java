package collections;

import java.util.Scanner;

public class OcOfanycharacter2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="My name is arunjith";

int count=0;


Scanner sc=new Scanner(System.in);

char b=sc.next().charAt(0);


for(int i=0;i<a.length();i++) {
	
	if(a.charAt(i)==b) {
		
		count++;
	}
	

}
System.out.println("count of character   " + count);


	}

}
