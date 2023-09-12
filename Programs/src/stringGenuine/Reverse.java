package stringGenuine;

public class Reverse {
	
	
    public static String  reverseWords(String S)
    {
        // code here 
        StringBuilder s1=new StringBuilder();
	        s1.append(S);
	        s1.reverse();
//	        System.out.println(s1);
	        System.out.println(s1);
			return S;
			
	        
			
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String m = "i.like.this.program.very.much";
	        
         reverseWords(m);
	}

} 


