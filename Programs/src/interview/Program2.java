package interview;

public class Program2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="arun12arun%%arun@@@arun**Arun";
		s1=s1.toLowerCase();
		String word="arun";
		int count=0;
		
		s1=s1.replaceAll("[^a-zA-z]", " ");
//		System.out.println(s1);
		String[] a=s1.split(" ");
		
		for(int i=0;i<=a.length-1;i++) {
			
			if(word.equals(a[i])) {
				count++;
				
			}
			
		}
		System.out.println("The word " +word + " is repeated " + count + " times");
	}

}
