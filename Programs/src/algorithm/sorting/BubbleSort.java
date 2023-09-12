package algorithm.sorting;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[]= {2,4,5,2,6};
		
		for(int i=0;i<a.length;i++) {
			
			
			for(int j=0;j<a.length-i-1;j++) {
				
				if(a[j]>a[j+1]) {
					
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
					
				}
				
			}
			
			
			
		}
		for(int k=0;k<a.length;k++) {
			
			System.out.print(a[k]);
		}
		
	}

}
