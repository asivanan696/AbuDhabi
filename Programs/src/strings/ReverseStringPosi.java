package strings;

public class ReverseStringPosi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="My name is Arunjith";
		
		String[] words=s.split("\\s");
		
	String rev=" ";
	StringBuilder w = null;
		
	
for (int i=words.length-1;i>=0;i--) {
	
	rev= words[i] + rev;
	
// w=new StringBuilder(rev);
//	w.reverse();
	
	}
	
System.out.println(rev.trim());
}

	
		
		
	}

//}
