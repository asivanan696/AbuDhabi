package practice;

import java.util.Scanner;

public class PrimeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int count=0;
		
	  for(int i=1;i<=no;i++) {
		 count=0;
		  
		for(int j=2;j<=i/2;j++) {
			if(i%j==0) {
			count++;
			break;
			
		}
		}
		if(count==0) {
			System.out.println(i + " ,");
		}
		  
	  }

}
}