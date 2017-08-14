package day17_CollectionFrameWork_HashCode;

class Person{
	
	String name;
	public void setName(String name) {

		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
	
} // end of Person

class MyClass {
	
	public void myMethod(Object objRef){  // as a generic parameter
		
		System.out.println(objRef);
		
	}
	
}

public class ObjectExample {

	public static void main(String[] args) {

		MyClass ref = new MyClass();
		ref.myMethod(123);
		ref.myMethod("java");
		ref.myMethod(12.50);
		ref.myMethod(true);
		
		Person pRef = new Person();
		pRef.setName("Wang");
		ref.myMethod(pRef);
		
	}

}
