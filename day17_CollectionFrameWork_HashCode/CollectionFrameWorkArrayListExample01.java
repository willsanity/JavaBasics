package day17_CollectionFrameWork_HashCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CollectionFrameWorkArrayListExample01 {

	public static void main(String[] args) {

		//ArrayList ref = new ArrayList();
		List<Object> ref = new ArrayList<Object>(); // This Line is upcasting
		ref.add(123);
		ref.add("java");
		ref.add(12.45);
		
		Person pRef = new Person();
		pRef.setName("Melvin");
		
		ref.add(pRef);
		
		System.out.println(ref);
		
		// using for loop
		for (int i = 0; i < ref.size(); i++) {
			System.out.println(ref.get(i));
		}
		
		// using for each loop
		for (Object object : ref) {
			System.out.println(object);
		}
		
		// using Iterator interface
		Iterator itrRef = ref.listIterator();
		while (itrRef.hasNext()) {
			System.out.println(itrRef.next());
			
		}
	}
	
}

