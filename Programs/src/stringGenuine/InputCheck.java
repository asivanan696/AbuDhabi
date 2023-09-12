package stringGenuine;

public class InputCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="abhi";
		
		try {
			Integer.parseInt(s);
			System.out.println("intger");
		}
		catch(NumberFormatException e){
			System.out.println("Not an Integer");
		}

	}

}
