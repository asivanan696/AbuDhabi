package strings;

public class Niv {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
		String s="nivedya";
		StringBuffer alt=new StringBuffer(),alt2=new StringBuffer();
		for(int i=0;i<s.length();i++) {

			if(i%2==0) {

				alt.append(s.charAt(i));
			}
			else {

				alt2.append(s.charAt(i));
			}
		}
		System.out.println("FirstSet------> " + alt);
		System.out.println("SecondSet------> " + alt2);

	}

}
