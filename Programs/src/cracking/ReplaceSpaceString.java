package cracking;

public class ReplaceSpaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		String s="Mr John Smith   ";
		int a=s.length();
		s=s.substring(0, a).trim();
		
		
		s=s.replaceAll("\\s", "%20");
			
			
			
			System.out.println(s);
		
		
		
		

	}

}
