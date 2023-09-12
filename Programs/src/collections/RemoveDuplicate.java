package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="geeksforgeeks";
		
		LinkedHashSet<Character> set=new LinkedHashSet<Character>();
		
		for(int i=0;i<s.length();i++) {
			
			set.add(s.charAt(i));
			
			
		}
		
		Iterator i=set.iterator();
		while(i.hasNext()) {
			
			System.out.print(i.next());
		}
		
	}

}
