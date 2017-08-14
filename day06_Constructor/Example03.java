package day06_Constructor;

class A{
	private B refB; // refB is a reference class of class B , reference type / primitive type
	
	A(B refB){ // by using constructor, refB is a reference of type B
		this.refB = refB; // assigning to global variable
	}

	void access(){
		
		refB.show();
		
	}
}// end of class A

class B{
	
	void show(){
		System.out.println("I am in show..");
	}
	
} // end of class B

public class Example03 {

	public static void main(String[] args) {

		B refB = new B();
		A ref = new A (refB); // passing refB as a argument
		ref.access();
		
	}

}
