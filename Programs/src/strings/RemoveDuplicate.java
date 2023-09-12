package strings;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class RemoveDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="13456666908772";
		char dup[]=s.toCharArray();

		LinkedHashSet<Character> set=new LinkedHashSet<Character>();

		for(int i=0;i<=s.length()-1;i++) {
			if(set.add(dup[i])==false && set.remove(dup[i]));


		}
		Iterator<Character> i= set.iterator();
		while(i.hasNext()) {
			System.out.print(i.next());


		}
	}
}