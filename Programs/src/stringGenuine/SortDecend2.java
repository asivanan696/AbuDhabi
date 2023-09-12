package stringGenuine;

import java.util.Arrays;

public class SortDecend2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="geeksforgeeks";
		char[] a=s.toCharArray();
		
		Arrays.sort(a);
		System.out.println(a);
		int n=a.length;
		System.out.println(n);
		char t;
		for(int i=0;i<n/2;i++) {
			t=a[i];
			a[i]=a[n-i-1];
			a[n-i-1]=t;
			
			
			
		}

		System.out.println(a);
	}

}
