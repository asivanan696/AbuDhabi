package cracking;

public class CountsRepeated {
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String a="aabcccaaaa";
		int no=a.length()-1;
		
		
		StringBuilder sb=new StringBuilder();
		int count=1;
		
		
		
		for(int i=1;i<a.length()-1;i++) {
			
			if(a.charAt(i)==a.charAt(i-1)) {
				
				count++;
			}else {
			
			sb.append(a.charAt(i-1)).append(count);
			count=1;
			
		}
		
		
	}
//		sb.append(a.charAt(a.length()-1)).append(count);
		sb.append(a.charAt(no)).append(count);
		System.out.println(sb.toString());

}
}