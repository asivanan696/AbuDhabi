package interview;

import java.util.Arrays;

public class Trial1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="alkasingh";
		StringBuilder s1=new StringBuilder(s);
		char a[]=s1.toString().toCharArray();
		Arrays.sort(a);
		
		s1.append(a);
		System.out.println(a);

	}

}
