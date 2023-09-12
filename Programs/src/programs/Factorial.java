package programs;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		   BigInteger fact= BigInteger.ONE;

      for (int i = 2; i <= no; i++)
         {
              fact = fact.multiply(new BigInteger(String.valueOf(i)));
      }

       System.out.println("factorial" + no +" is: " + fact);
   }
}
