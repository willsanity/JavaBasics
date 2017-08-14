package day06_Constructor;

class User{
	
	//String userName = "admin";
	//
	String userName;
	
	User(){    			 		//default constructor purpose of consturctor is to initialise the instance variable
		userName="admin";		//2 types of constructor, default , parameter constructor.
		
	}
	
	void userDisplay(){			//method give a convention
		
		
	}
}

public class Example01 {

	public static void main(String[] args) {

		User ref = new User(); 					//constructor is a type of method
		
	}

}
