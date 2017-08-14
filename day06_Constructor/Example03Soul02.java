package day06_Constructor;

class Aa{
	private Bb refB; // refB is a reference class of class B , reference type / primitive type
	
	//solution 1  ( by using constructor)
	
	/*A(B refB){ // by using constructor, refB is a reference of type B
		this.refB = refB; // assigning to global variable
	}*/
	
	
	// solution 2 (( by using setter method))

	public void setRefB(Bb refB){
		this.refB =refB;
	}
	
	void access(){
	refB.show();
		
	}
}// end of class A

class Bb{
	
	void show(){
		System.out.println("I am in show..");
	}
	
} // end of class B

public class Example03Soul02 {

	public static void main(String[] args) {

		Bb refBb = new Bb();
								//A ref = new A (refB); // passing refB as a argument
		Aa refAa = new Aa();
		
		refAa.setRefB(refBb);
		refAa.access();

		
	}

}
