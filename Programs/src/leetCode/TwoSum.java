package leetCode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

	int a=123;
	int temp=0;
	int b=0;
	while(a!=0) {
		
		b=a%10;
		
		temp=temp*10+b;
		a=a/10;
		
		
	}
	System.out.println(temp);

    }
}
