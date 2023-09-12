package leetCode;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=1230;
		int temp=0;
		String b=String.valueOf(a);
		char rev = 0;
		
	for(int i=b.length()-1;i>=0;i--) {
		
		rev=(char) (b.charAt(i)+rev);
		
	}
	System.out.println(rev);

}

}