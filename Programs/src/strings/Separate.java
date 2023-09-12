package strings;

public class Separate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String a ="arunjiths91@gmail.com";
		
		StringBuffer alpha=new StringBuffer(), num=new StringBuffer(),special=new StringBuffer();
		for(int i=0;i<=a.length()-1;i++) {
			
			if(Character.isDigit(a.charAt(i)))
				num.append(a.charAt(i));
		else if(Character.isAlphabetic(a.charAt(i)))
		alpha.append(a.charAt(i));
		
		else
			special.append(a.charAt(i));
			
		}
		
		System.out.println(alpha);  
		System.out.println(num);  
		System.out.println(special);  

	}
	
	

}
