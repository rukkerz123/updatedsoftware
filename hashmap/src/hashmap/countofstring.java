package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class countofstring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		String name = " this is java";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		System.out.println(hm);
		char[] ch = name.toCharArray(); 
		for(char b: ch) {
			if(hm.containsKey(b)) {
				hm.put(b, hm.get(b)+ 1);
			}else 
				hm.put(b, 1);
		} 
		System.out.println(hm); 
		Set<Map.Entry<Character,Integer>> se=hm.entrySet();
		for(Map.Entry<Character, Integer>entry: se) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+ " "+ entry.getValue());
			}
		}

	}

}
