package day04_CommandLine_Argument;

import java.util.Scanner;
	
class Data{
		
		static void showData(){
			
			System.out.println("hello");
			
		}
		
	}	//end of data
	
class Logic{
		
		void checkCondition(String str){
			
			if (str.equals("admin")){
			Data.showData();
		} else {
			System.err.println("wrong password");
		}
		
	}	//end of logic
}
class Access{
	
	Logic ref = null;
		void userInput(){
			
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter your password: ");
			ref = new Logic();
			ref.checkCondition(sc.next());
		}
	
	
}	//end of access


public class DoWhileExample {
	public static void main(String[] args) {
		Access ref = null;
		String choice = null;
		Scanner sc = new Scanner(System.in);
		
		do{
			ref = new Access();
			ref.userInput();
			System.out.println("wish to Continue: ");
			choice = sc.next();
		}while(!choice.equals("no"));
		System.out.println("thank you");

		}

	}

