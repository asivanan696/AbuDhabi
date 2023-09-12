package stringGenuine;

public class AllCharactersSame {
	
	
	public static boolean match(String a) {
		
		for(int i=0;i<a.length();i++) {
			
			if(a.charAt(0)!=a.charAt(i)) {
				
				return false;
				
			}
		}
		
		
		return true;
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="GGGG";
		
		if(match(s)) {
			System.out.println("matches");
		}
		else {
			System.out.println("Doesn't match");
		}
		

	}

}
