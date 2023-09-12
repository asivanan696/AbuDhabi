package algorithm.searching;

public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = { 2, 3, 4, 10, 40 };
		
		int x=10;
		int n=arr.length;
		int low=0;
		int high=n-1;
		int mid=(low+high)/2;
		
		if(arr[mid]==x) {
			
			System.out.println(mid);
		}
		else if(arr[mid]>x){
			
		System.out.println(mid-1);
		}
		else if(arr[mid]<x){
			
			System.out.println(mid+1);
			}
		
		else {
			System.out.println("not present");
		}
		
	}

}
