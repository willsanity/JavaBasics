package day03_Casting_Last_in_Fo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class UserInput{
	
	void accept() throws IOException{
		
		BufferedReader ref = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("enter a character :");
		//char c = (char) ref.read();  //read means first character
		
		char c = ref.readLine().charAt(2); // readline means read entire string //.charAt(2) meaning read the 3rd letter.
		System.out.println("you have entered :" +c);
		
		System.out.println("enter your name:");
		String name= ref.readLine();	//readLine doesn't need casting
		System.out.println("Your name:");
		
		System.out.println("Your Age: ");
		//int age = ref.read();
		Integer age = Integer.parseInt(ref.readLine()); // entire String convert to Object
		System.out.println("Your Age: " +age);
		
		
		System.out.println("Enter Salary: ");
		Double salary = Double.parseDouble(ref.readLine());
		System.out.println("Salary: " +salary);
	}
	
}


public class Example05_Casting {
	
	public static void main(String[] args) throws IOException {

		UserInput ref = new UserInput();
		ref.accept();
		
	}

}
