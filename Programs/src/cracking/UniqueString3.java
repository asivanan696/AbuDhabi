package cracking;

import java.util.Scanner;

public class UniqueString3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter any string to verify it's unique");
        String a=sc.next();
        
        boolean[] boo=new boolean[128];
        
        
        for(int i=0;i<a.length()-1;i++) {
        	
        	
        	if(boo[a.charAt(i)]) {
        		
        		System.out.println("duplicate");
        		return;
        	}
        	
        	boo[a.charAt(i)]=true;
        	
        	
        }
        System.out.println("no Duplicate");
        
        
        
        

	}

}
