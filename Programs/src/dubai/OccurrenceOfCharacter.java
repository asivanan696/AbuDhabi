package dubai;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class OccurrenceOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String input ="programming";
		
		input=input.replace("\\s", "");
	char[] cha=	input.toCharArray();
	
	
	Map<Character, Integer> map=new TreeMap<Character,Integer>();
	
	
	for(char ch:cha) {
		
		if(map.containsKey(ch)) {
			
			int count=map.get(ch);
			
			map.put(ch, ++count);
			
		}
		
		
		else {
			
			map.put(ch, 1);
		}
		
	}
	
for(Map.Entry m:map.entrySet()) {
	
	System.out.println(m.getKey()+ "" +m.getValue());
	
}
	

	}

}
