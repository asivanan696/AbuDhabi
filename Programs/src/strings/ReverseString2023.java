package strings;

public class ReverseString2023 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="My Name Is Arunjith";
		
		String[] s1=s.split("\\s");
		String rev=" ";
		
		for(int i=s1.length-1;i>=0;i--) {
			
			
			rev=rev+s1[i] +" ";
			
			
		}
		
		System.out.println(rev);
		

	}

}
