package hashMap;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
			Set ref = new HashSet();
			//	Set ref = new TreeSet(); // for sorted order 
				ref.add("x123");
				ref.add("a224");
				ref.add("b777"); // ***Duplicate
				ref.add("g312");
				ref.add("b777"); // no duplicate element added

				System.out.println(ref);
	}

}
