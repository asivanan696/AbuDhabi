package stringGenuine;

import java.util.Arrays;
import java.util.Comparator;

public class SortingAsPerLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GeeksforGeeeks”, “I”, “Iid”, “from”, “am”";
		String[] a=s.split(",");
		
		Arrays.sort(a,Comparator.comparing(o->o.length()));
		
		for(int i=0;i<a.length;i++) {
			
			System.out.print(a[i].trim());
		}
		
		
		
			
		}

	}
