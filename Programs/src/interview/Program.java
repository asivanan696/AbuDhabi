package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Program {
	
	
	public static void countWords(String input){
        int count=0;
        
        input=input.toLowerCase();
        char[] words= input.toCharArray();
        HashMap<Character,Integer> map=new LinkedHashMap<Character,Integer>();
        
        for(char word:words){
        	
        	if(Character.isLetter(word)) {
            if(map.containsKey(word)){
              count=  map.get(word);
              map.put(word,++count);
            }
            else{
                
                map.put(word,count);
            }
        }
        
    
    }
        System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String toCount="personal/e000422_cigniti_com/_layouts/15/onedrive.aspx?FolderCTID=0x012000336C3A0F8B2337469B9DE6341793EE83";

		
	   countWords(toCount);
        
    }	
}