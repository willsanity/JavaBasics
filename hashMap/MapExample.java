package hashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {

		Map<String,Integer> ref = new HashMap();
		ref.put("google", 11);
		ref.put("twitter",3);
		ref.put("yahoo",5);
		ref.put("ebay",10);
		ref.put("alibaba",7);
		
		Set set = ref.entrySet();
		Iterator i = set.iterator();
		
		while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.println(me.getKey() + ":"+ me.getValue());
	      }
		
	}

}
