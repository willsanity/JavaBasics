package sortData_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableDemo {

	public static void main(String[] args) {

		List ref = new ArrayList();
		ref.add(new Book("english", 5));
		ref.add(new Book("math", 2));
		ref.add(new Book("history", 7));
		ref.add(new Book("computer", 10));
		
		System.out.println("UnOrdered: " +ref);
		
		Collections.sort(ref);
		System.out.println("Ordered: " +ref);
		
		// the differences between comparable and comparator
	}

}
