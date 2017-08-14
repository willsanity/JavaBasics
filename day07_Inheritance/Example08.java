package day07_Inheritance;


// if parent class has parameter
class Laptop{
	
	String str = "oldData";
	Laptop(String str){
		System.out.println(str);
	}
} // end of Laptop

class HP extends Laptop{

	HP(String str) {
		super(str);  // call parent class constructor
		System.out.println(str + " " +1234);
	}
	
	
}

public class Example08 {

	public static void main(String[] args) {

		new HP("newData");
		
	}

}
