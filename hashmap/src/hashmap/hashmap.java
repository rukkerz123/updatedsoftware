package hashmap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		HashMap hm = new HashMap(); 
		hm.put("srinath dhamu", 100);
		hm.put("harish", 101);
		hm.put("kalyan",102);
		System.out.println(hm); 
		System.out.println(hm.containsKey("harish"));
		System.out.println(hm.containsValue(101));
		
		Set s=hm.keySet();
		System.out.println("keys are"+ s); 
		Collection t=hm.values(); 
		System.out.println("values are"+ t);
		Set s2 =hm.entrySet(); 
		System.out.println("entries are"+ s2); 
		Iterator i= s2.iterator(); 
		while(i.hasNext()) { 
			Map.Entry me = (Map.Entry)i.next();
			
			//System.out.println(i.next());  
			System.out.println(me.getKey()+ ":"+ me.getValue()); 
			if(me.getKey().equals("kalyan"))
				me.setValue(200);
			System.out.println(me); 
			if(me.getKey().equals(101))
				me.setValue("Girish"); 
			if(me.getValue().equals(101))
				System.out.println(me.getKey());
			if(me.getValue().equals(101))
					
me.setValue("Girish");
			if(me.getKey().equals("girish"))
				me.setValue(101); 
			if(me.getValue().equals(101))
				System.out.println(me.getKey());
		
		} 
		System.out.println(hm);

	


}

}
