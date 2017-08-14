package day12_ExceptionHandling;

import java.util.Scanner;

import javax.xml.bind.ValidationException;



class ValidateAge extends Exception{
	
	/*public ValidateAge(String string){
		System.out.println(string);
	}*/
	static int age;
	static void getAge(){
		
		System.out.println("enter a age");
		Scanner sc = new Scanner(System.in);
		age = sc.nextInt();
		
		
	}
	
	public static void validateUserAge(){
		
		//int age = 16;   //20 to get welcome
		
		if (age<18) {
			
		
			try {
				 // if your writing a throw key word in a class, so that means that class must extends exception class so that we can point to the reference.
				throw new ValidateAge(); // calling parameterize
				
			} // end of try
			
			catch (ValidateAge e) { // handle exception

				System.out.println("age can't be less than 18.");

			} // end of catch
			
			
		} // end of if
		
		else {
			System.out.println("Welcome..");

		} // end of else
		
	} // end of validateUserAge()
	
} // ValidateAge

public class Example05 {

	public static void main(String[] args) {

		ValidateAge.getAge();
		ValidateAge.validateUserAge();
		
	}

}
