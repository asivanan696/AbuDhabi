package stringGenuine;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Java {

	 
	
	public static void main(String[] args) {  
		ArrayList<String> al=new ArrayList<String>();  
		al.add("a");  
		al.add("d");  
		al.add("b");  
		al.add("c");  
		  
		Collections.sort(al,Collections.reverseOrder());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		System.out.println(itr.next());  
		 }  
		}  
		}