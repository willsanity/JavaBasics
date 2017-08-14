package sortData_Pai_Xu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;


// we are going to use Comparator interface to sort data.
// Comparator interface is also known as custom sorting order

public class SortDataApplication {

	public static void main(String[] args) {

		List ref = new ArrayList();
// We are creating of object of person class, and calling parameterize constructor of Person class. The entire Obj person class we have pass as a value . 
		ref.add(new Person("james", 45)); 
		ref.add(new Person("anderson",20 ));
		ref.add(new Person("boon", 30));
		ref.add(new Person("kath", 45));
		
		// get data
		
		for (Object temp : ref) {
			System.out.println(temp);
		}
		
		//Comparator interface 1st way
		Collections.sort(ref, new SortByName());
		
		// get data
		System.out.println("\n Sort by Name : ");
		for (Object temp : ref) {
			System.out.println(temp);			
		}
		
		// Comparator interface 2nd way
		Collections.sort(ref, new Comparator<Person>() {

			@Override
			public int compare(Person p1, Person p2) {

				return p1.getAge() - p2.getAge();  //- is for integer / compareTo is for String
			}
		});

		System.out.println("\n Sort by Age : ");
		for (Object temp : ref){
			System.out.println(temp);
		}
			
		
	}

}
