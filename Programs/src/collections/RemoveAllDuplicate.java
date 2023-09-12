package collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveAllDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
String s="geeksforgeeks";
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		LinkedHashSet<Character> set1=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
		
		if(set.add(s.charAt(i))==false && set.remove(s.charAt(i))){
//			System.out.println(set);
			set1.addAll(set);
			
		}	
		
	}
		Iterator<Character> i= set.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
			
}
		System.out.println("ddd" +set1);
}
}