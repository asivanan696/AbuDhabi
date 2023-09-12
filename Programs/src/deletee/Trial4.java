package deletee;

import java.util.HashSet;
import java.util.Set;

public class Trial4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a[]= {1,2,4,6,8,2,4,1}; 
		
		
		Set<Integer> set=new HashSet<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			if(!set.add(a[i])) {
				
				System.out.println(a[i]);
			}
		}
		
		
		
	}

}
