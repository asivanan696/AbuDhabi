package collections;

public class RemoveUsing2ndString {
	
	
	public static void removeChars(String str1, String str2) {
	    StringBuilder sb = new StringBuilder();
	    for (int i = 0; i < str1.length(); i++) {
	        if (!str2.contains(String.valueOf(str1.charAt(i)))){
	            sb.append(str1.charAt(i));
	        }
	    }
	    System.out.println(sb);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "India is great";
		String strt="in";
		
		removeChars(str,strt);
		

	}

}
