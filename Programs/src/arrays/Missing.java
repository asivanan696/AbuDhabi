package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Missing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a= {9, 4,1,3,5,6};
		ArrayList<Integer> al=new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++) {
			
			al.add(a[1]);
		}
		Collections.sort(al);
		
			int index=Collections.binarySearch(al,5);
		System.out.println(index);

	}

}
