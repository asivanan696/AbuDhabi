package algorithm.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		int a[]= {4,5,3,55,32};


		for(int i=0;i<a.length;i++) {

			int min=i;

			for(int j=i+1;j<a.length;j++) {

				if(a[min]>a[j]) {

					min=j;

				}
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;

			}



			
		}



		for(int k=0;k<a.length;k++) {

			System.out.print(a[k]+ " ");
		}
	}

}
