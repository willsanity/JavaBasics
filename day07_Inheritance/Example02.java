package day07_Inheritance;

class Country{  // parent / super / base class
	void show1(){
		System.out.println("Country ===>show1 ");
		
	} // end of show1
	
	static void show2(){
		System.out.println("Country ===>show2");
		
	} // end of show2
	
} // end of Country

// child / sub / derived class

class Singapore extends Country{ // Singapore is a type of Country

	void show1(){
		System.out.println("Singapore ===> show1 ");
		
	} // end of show1
	
	static void show2(){
		System.out.println("Singapore ===> show2");
		
	} // end of show2
	
	
} // end of Singapore


public class Example02 {

	public static void main(String[] args) {

		// creating object of Singapore and refer to its parent class
		Country refCountry = new Singapore(); // upCasting  // weak reference Singapore refer to Country.
												// strong reference  new Singapore obj refer to Singapore.
		refCountry.show1();
		refCountry.show2(); // if parent class has a static method, parent can't overwrite
	}

}
