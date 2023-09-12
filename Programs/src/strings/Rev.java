package strings;

public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s= "My name is Arunjith";
		
		String se[]=s.split("\\s");
		
		String rev=" ";
		
		
	for(int i=0;i<se.length;i++) {
		
		for(int j=se.length-1;j>=0;j--) {
			
			System.out.print(se[i].charAt(j));
			
			
		}
		System.out.println(rev);
		
	}
	
		
	}
	
	}


