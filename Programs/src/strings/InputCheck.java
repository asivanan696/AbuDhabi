package strings;

public class InputCheck {

	static boolean isNumber(String s) {
		
		for (int i = 0; i < s.length(); i++)
            if (Character.isDigit(s.charAt(i))==false) {
            	return false;
            }
		return true;
                
 
        
		
		
		
		
		
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="Arun";
		
		if (isNumber(a)) {
			System.out.println("Is Integer");
		}
	
		else {
			
			System.out.println("It's Character");
		}
	}

}
