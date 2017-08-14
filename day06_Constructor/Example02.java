package day06_Constructor;

class Employee{
	
	Employee(){
		this("Rando");
		System.out.println(" Im the default constructor");
		
	}
	Employee(String name){
		this(25,4500);
		System.out.println("Hello" +name);
	}
	Employee(int age, double salary){
		System.out.println("Age :" +age+ "salary");
	}
	
}


public class Example02 {
	
	public static void main(String[] args) {

		new Employee();
		//new Employee("Rando");
		//new Employee(25, 4500);
				
	}

}
