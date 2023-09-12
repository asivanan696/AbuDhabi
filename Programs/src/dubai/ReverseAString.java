package dubai;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="Hello World";
		
//		for(int i=a.length()-1;i>=0;i-- ) {
//			
//			System.out.print(a.charAt(i));
//			
//			
//			
//			
//		}
		
		
		
		StringBuilder s=new StringBuilder(a);
  StringBuilder rev=   s.reverse();
  
  System.out.println(rev);
  
		

	}

}
