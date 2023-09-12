package interview;

import java.util.ArrayList;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		String s1 = “arunjith.sivanand.91”;
//
//		Get the middle name:  sivanand
		
//		String s1="arunjith.sivanand.91";
//		String[] s2=s1.split("\\.");
//		System.out.println(s1.sub);
		
			
//	String s1="$30";
//	String s2="$5.5";
////	result should be $35.5
//	 double s3=Double.parseDouble(s1.substring(1));
//	 double s4=Double.parseDouble(s2.substring(1));
//	 double output=s3+s4;
//	 
//	 Character.isDigit(0)
//	 Character.isAlphabetic(0)
//	 
//	 System.out.println("$"+output);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	String input="35USD";
	String s2="5.5USD";
//	StringBuffer s=new StringBuffer();
	StringBuffer s0=new StringBuffer();

	char[] a=input.toCharArray();
	for(int i=0;i<input.length();i++) {
		
		if(!Character.isDigit(a[i])) {
			s0.append(a[i]);
		}
			
		
	}

	
	double s3=Double.parseDouble(input.substring(1));
	double s4=Double.parseDouble(s2.substring(1));
	
	double s5=s3+s4;
	System.out.println(s0+""+s5);
		
		
		

	}

}