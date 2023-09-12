package dubai;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String input="racecar";
		
		StringBuilder s=new StringBuilder(input);
		  StringBuilder rev1=   s.reverse();
		String rev=  rev1.toString();
		  
		  
		  System.out.println(rev);
		  System.out.println(input);
		  
		  
		  if(input.equals(rev))
			  
		  {
			  System.out.println("Palindrome");
		  }
		  
		  else {
			  System.out.println("Not");
		  }
		
	}

}
