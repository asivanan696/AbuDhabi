package arrays;

import java.util.Arrays;

public class HighestN0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[]=new int[] {66,10,40,3,55,10};
		int temp=0;
		int second=0;
		int total=a.length-3;
		
		for(int i=0;i<a.length;i++) {
			
			if(a[i]>temp) {
				
			 temp=a[i];
			 
				
			}
			
			
		}
		
		System.out.println(a[total]);

	}

}
