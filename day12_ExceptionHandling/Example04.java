package day12_ExceptionHandling;

import java.util.Scanner;

class DivideByZeroExecption extends ArithmeticException{
	
	static void myMethod(){
		
		System.out.println("enter a divisor");
		Scanner sc = new Scanner(System.in);
		int value = sc.nextInt();
		if(value == 0){
			
			try{
				throw new DivideByZeroExecption();  //throw keyword is where it points to
				
			} catch (DivideByZeroExecption e) {
				
				System.out.println("Divisor Can't be 0");
			}
			
		}
		else {
			System.out.println(10/value);
		}
		
	}
	
}

public class Example04{
	public static void main(String[] args) {
		
		DivideByZeroExecption.myMethod();
	}
}