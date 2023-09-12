package interview;

import java.util.ArrayList;

public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Use any one of java collections methods to solve this problem.

		int l[] = {4, 7, 3, 2, 9, 6, 1};
		
		ArrayList<Integer> a=new ArrayList<Integer>();
		
		for(int i=0;i<l.length;i++) {
			
			a.add(l[i]);
			
		}

		int fixed=4;
		int c=0;
		
	for(int i=1;i<l.length;i++) {
	   c=l[i]+fixed;
	   a.add(c);
		c=0;
	
	}
		
		System.out.println(a);
		//Output list= [4, 7, 3, 2, 9, 6, 1,  11, 7,6,13,10,5]
	

	}

}
