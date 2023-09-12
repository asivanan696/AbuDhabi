package strings;

public class OcurrSpecialChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="arun####arun35337arun&8arun";
//		String[] b=a.split("arun");
//		int occu=b.length;
//		System.out.println(occu);
		int count=0;
		
		int i=a.indexOf("arun");
		System.out.println(i);
		
		while(i !=-1) {
			count++;
			System.out.println(count);
			i=a.indexOf("arun", i+1);
			
		}
		
		System.out.println("Final Answer " +count);
	}

}
