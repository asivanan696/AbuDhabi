package stringGenuine;

import java.util.HashSet;

public class AllCharacterssame2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="GGoioo";
		int total=s.length();
		HashSet<String> set=new HashSet<String>();
		for(int i=0;i<s.length();i++) {
			set.add(s);
		}
		
if(set.size()==total) {
	System.out.println("matches");
}

else {
	System.out.println("No matches");
}
	}

}
