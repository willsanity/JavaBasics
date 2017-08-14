package day17_CollectionFrameWork_HashCode;

//Generics does not support primitive type.
//But only wrapper class & Custom class & Any Java define API
// We use Generics to avoid class cast exception

// create a generic interface
// List interface in collection framework
interface Bank<Singapore>{	 // here Singapore is considered as Type<T>
	
	void bankInfo(Singapore ref); // ref is a local variable of Singapore Type

} // end of interface

// create a generic class
// ArrayList is an implemented class of List Interface
class DBS<IBanking> implements Bank<IBanking>{ // IBanking is again Type<T>

	@Override
	public void bankInfo(IBanking ref) { // act as an add(Object ref) method
		System.out.println(ref);
	}
	
}

public class GenericsDemo {  // Generics is a concept we use it for Java collection framework.

	public static void main(String[] args) {

		Integer iRef = 12345;
		DBS<Integer> ref1 = new DBS<Integer>();
		ref1.bankInfo(iRef);
		
		String str = "java";
		DBS<String> ref2 = new DBS<String>();
		ref2.bankInfo(str);
		
		Double dRef = 20.45;
		DBS<Double> ref3 = new DBS<Double>();
		ref3.bankInfo(dRef);
		
		Person pRef = new Person();
		pRef.setName("Nicholas");
		
		DBS<Person> ref4 = new DBS<Person>();
		ref4.bankInfo(pRef);
		
	}

}
