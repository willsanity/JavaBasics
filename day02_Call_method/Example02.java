package day02_Call_method; 

//How to call a method outside of a class

class Employee{
	
	String employeName = "Will";
	int employeeAge = 28;
	
	void displayInformation(){
		System.out.println(employeName);
		System.out.println(employeeAge);
		
	} // end of displayInformation
	
} // end of class


public class Example02 {

	public static void main(String[] args) {
		
		//Creating an object to access static method
		Employee ref = new Employee();
		ref.displayInformation();

	} // end of main

}  // end of Example02
