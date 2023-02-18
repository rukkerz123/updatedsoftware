package hashmap;

import java.util.TreeMap;

public class treemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		TreeMap tm1 = new TreeMap();
		tm1.put(100, "srinath");
		tm1.put(101, "harish");
		System.out.println(tm1);

		TreeMap tm2 = new TreeMap(); 
		tm2.put(102, "dhamu");
	
		tm2.putAll(tm1);
		System.out.println(tm2);
		System.out.println(tm2.lastKey());
		System.out.println(tm2.lastEntry());
		System.out.println(tm2.higherEntry(101));
		System.out.println(tm2.firstEntry());
		System.out.println(tm2.higherEntry(102));
		

	}

}
