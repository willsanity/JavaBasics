package day17_CollectionFrameWork_HashCode;

import java.util.ArrayList;
import java.util.List;

class Employee{
	
	String name;
	
	@Override
	public int hashCode() { //hashCode check memory location
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) { // equal (compare two objects, thereby check duplicate)
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name)) //equal (compare two object, thereby check duplicate)
			return false;
		return true;
	}
	
	Employee(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
}

public class CollectionFrameWorkArrayListExample03 {

	public static void main(String[] args) {

		List ref = new ArrayList();
		ref.add(new Employee("james"));
		ref.add(new Employee("jasper"));
		ref.add(new Employee("james"));
		
		System.out.println(ref);
		
		for (int i = 0; i < ref.size(); i++) {
			for (int j = i+1; j < ref.size(); j++) {
				if(ref.get(i).equals(ref.get(j))){
					ref.remove(j);
					j--;
				} // end of if
			} // end of inner for
			
		} // end of outer for

		System.out.println("after removing duplicate data : "+ref);
			
	}
}
