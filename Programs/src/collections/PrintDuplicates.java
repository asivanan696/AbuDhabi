package collections;

import java.util.LinkedHashSet;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String test = "This sentence contains two words one and two";
		String rest[]=test.split(" ");
//		System.out.println(rest.toString());
		LinkedHashSet<String> set=new LinkedHashSet<String>();
		LinkedHashSet<String> set1=new LinkedHashSet<String>();
		
		for(int i=0;i<rest.length;i++) {
			
			if(set.add(rest[i])==false) {
				set1.add(rest[i]);
				
			}
			
		}
		
		System.out.println(set1);

				
	}

}
