package strings;

public class Trysd {


	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="geeks for geeks";
		String[] tok = str.split("\\s");
		 
		for(String w:tok)
	    {
	 
	        // Print the reversed word
	        System.out.print(reverseWord(w) + " ");
	    }
		
		

	}
	
	
	static String reverseWord(String str)
	{
	    int len = str.length();
	     
	    // Pointer to the second character
	    // of the string
	    int i = 1;
	 
	    // Pointer to the second last
	    // character of the string
	    int j = str.length() - 2;
	     
	    char[] strchar = str.toCharArray();
	 
	    while (i < j)
	    {
	 
	        // Swap str[i] and str[j]
	        char temp = strchar[i];
	        strchar[i] = strchar[j];
	        strchar[j] = temp;
	        i++;
	        j--;
	    }
	     
	    str = new String(strchar);
	    return str;
	}

}
