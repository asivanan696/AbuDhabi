import java.util.Arrays;

public class Findcount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3,4,1,80,64};


		Arrays.sort(arr);
		int n=arr.length;

		int i=0; int j=arr.length-1;
		
		while(i<j) {
			System.out.print(arr[j--] + " ");
			System.out.print(arr[i++] + " ");
		}
		
if(n%2!=0) {
	
	System.out.print(arr[i]);
}




	}
}





