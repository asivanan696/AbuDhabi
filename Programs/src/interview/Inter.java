package interview;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Inter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="selenium";
		char a[]=s.toCharArray();
		int count=0;
		
		HashMap<Character, Integer> map=new LinkedHashMap<Character, Integer>();
		HashMap<String,String> map2 =new HashMap<String,String>();
		
		map2.put("username", "arunjith");
		map2.put("Password", "ETF%$");
		
		for(char b:a) {
			
		if(map.containsKey(b)) {
			
			count=map.get(b);
			map.put(b, ++count);
			
		}
		else {
			
			map.put(b, 1);
		}
		
		System.out.println(map2);
			
		}
		for(Map.Entry entry:map.entrySet()) {
			
			
			System.out.println("Character " + entry.getKey() + " " + "Count " + entry.getValue());
		}

	}

}
