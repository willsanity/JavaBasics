package day08_Abstract_interface;

// how to create an abstract class

abstract class Vehicle{ // we use abstract keyword to create abstract class
	
	// abstract class can contain concrete method
	
	void display(){
		// method with a body..
		
		
	}
	
	// main purpose of abstract class is to declare an abstract method
	
	// how to declare an abstract method
	
	abstract void gear(); //abstract method ends with a semicolon
	
	abstract void shoBreak();
	
} // end of Vehicle

class Car extends Vehicle{

	@Override
	void gear() {
		
	}

	@Override
	void shoBreak() {
		
		
	}
	
	
}

class Bus{
	
}

public class AbstractClassExample01 {

	public static void main(String[] args) {

	}

}
