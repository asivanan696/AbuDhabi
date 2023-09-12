package collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Occur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="welcome";
		
		
		TreeMap<Character,Integer> map=new TreeMap<Character,Integer>();
		
		
		char[] c=s.toCharArray();
		
		
		for(char n:c) {
			
			if(map.containsKey(n)) {
				
			int count=	map.get(n);
			
			map.put(n, ++count);
				
				
				
				
			}
			
			else {
				
				map.put(n, 1);
				
			}
			
			
		}
		
		for(Map.Entry entry:map.entrySet()) {
			
			
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

	}

}
