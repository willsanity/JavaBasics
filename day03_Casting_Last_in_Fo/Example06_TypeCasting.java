package day03_Casting_Last_in_Fo;

import java.util.Scanner;

class UserInput2{
	
	static void access(){		// static method
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter name, age, salary: ");
		String name = sc.next();
		int age = sc.nextInt();
		float salary = sc.nextFloat();
		
		System.out.println("you have entered: " +name + " " +age +" " +salary);
		
	}
	
}		//end of class


public class Example06_TypeCasting {

	public static void main(String[] args) {
		

		// we can call by using ClassName.methodName()
		UserInput2.access(); 	//No need to create object
	}

}