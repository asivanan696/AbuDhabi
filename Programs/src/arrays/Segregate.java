package arrays;

import java.util.ArrayList;
import java.util.Collections;

public class Segregate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[]= {0,1,0,1,1,1};
ArrayList<Integer> a=new ArrayList<Integer>();

for(int b: arr) {
a.add(b);

}



Collections.sort(a);
System.out.println(a);


	}

}
