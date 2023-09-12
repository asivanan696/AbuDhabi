package stringGenuine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class SortStrings {

	public static void sort(String a) {
		
		
		ArrayList<Character> al=new ArrayList<Character> ();
		for(int i=0;i<a.length();i++) {
			al.add(a.charAt(i));
		}
		
		Collections.sort(al);
		
		Iterator<Character> i=al.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());
		}
		
		//System.out.println(al);
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String[] s ="abc", "xy";
		
//		sort(s);

	}

}
