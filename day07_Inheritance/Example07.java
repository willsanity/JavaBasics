package day07_Inheritance;


// parent / root class will execute first
class Car{
	
	Car(){
		
		System.out.println("Car default constructor");
	}
	
} // end of car

class Honda extends Car{
	
	Honda(){
		System.out.println("Honda default constructor");
	}
	
} // end of Honda


public class Example07 {

	public static void main(String[] args) {

		new Honda();
	}

}

