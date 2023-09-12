package deletee;

import java.util.Arrays;

public class Trai34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {1,2,4,6,8,2,4};  
		//output -- 2 {Find the duplicate from the list} 1,2,2,4







		//		System.out.println(System.currentTimeMillis());
		Arrays.sort(a);



		for(int i=0;i<a.length-1;i++) {

			if(a[i]==a[i+1]) {

				System.out.println(a[i]);

			}


		}


	}

}
