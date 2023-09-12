package strings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


//******************************Using List**************************************************************
public class ReverseString {

//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		String s="Arunjith";
//		char[] n=s.toCharArray();
//		ArrayList<Character> ls= new ArrayList<Character>();
//		for(Character rev: n) {
//			
//			ls.add(rev);
//			
//		}
//		
//		Collections.reverse(ls);
//		
//		Iterator i=ls.iterator();
//		while(i.hasNext()) {
//			
//		System.out.print(i.next());
//			
//		}
////		System.out.println(ls);
//
//	}
//
//}
//******************************Using String Builder**************************************************************
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//	String s= "Arunjith";
//	StringBuilder se=new StringBuilder(s);
//	se.append(s);
//	se.reverse();
//	System.out.println(se);
//
//	}
//
//}
//******************************Using String Builder**************************************************************

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=98765;
		
	String s= String.valueOf(a);
	 String words[]=s.split("\\s"); 
	 String rev=" ";
	 
	 for(String w: words) {
	StringBuilder se=new StringBuilder(w);
	
	se.reverse();
	
	rev=rev + se.toString()+ " ";
	 }
	System.out.println(rev.trim());
	

	}

}
	