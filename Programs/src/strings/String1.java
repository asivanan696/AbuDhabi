package strings;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class String1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String a="welcomel";   //wlcom //welcom

char[] b=a.toCharArray();

HashSet<Character> set=new LinkedHashSet<Character>();
for(int i=0;i<b.length;i++) {
	System.out.println(b[i]);
	
	if(!set.add(b[i])&& set.remove(b[i])){  //e l   
		
		
	}
	
	//welcom    
	
	
}

System.out.println(set);
		
	}

}


