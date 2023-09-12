package practice;

import java.util.Scanner;

public class OddOrEven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		
		if(no%2==0) {
			
			System.out.println("The given number " + no + " is Even" );
		}
		
		else {
			System.out.println("The given number " + no + " is Odd");
		}
		
	}

}
