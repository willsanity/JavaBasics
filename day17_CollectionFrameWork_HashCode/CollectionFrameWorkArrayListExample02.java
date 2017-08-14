package day17_CollectionFrameWork_HashCode;


import java.util.ArrayList;
import java.util.List;

public class CollectionFrameWorkArrayListExample02 {

	public static void main(String[] args) {

		List ref = new ArrayList();
		
		ref.add("java");
		ref.add("Java");
		ref.add(null);
		ref.add(123);
		ref.add(null);
		ref.add("java");
		ref.add(null);
		System.out.println(ref);
		
	}

}
