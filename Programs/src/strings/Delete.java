package strings;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="arunjith234988899@gmail.com";
		StringBuffer num=new StringBuffer(),alpha=new StringBuffer(),speci=new StringBuffer();
		
		
		for(int i=0;i<=a.length()-1;i++) {
			
			if(Character.isDigit(a.charAt(i)))
				num.append(a.charAt(i));
	else if (Character.isAlphabetic(a.charAt(i)))
			alpha.append(a.charAt(i));
			
			else 
				speci.append(a.charAt(i));
			
		}
		
		System.out.println("number : " +num);
		System.out.println("Alphabet :" +alpha);
		System.out.println("Special :" + speci);

	}

}
