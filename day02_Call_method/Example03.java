package day02_Call_method;

class FaceBook{
	
	int userID; //Global variable
	String password; //Global Variable
	
	
		//Access is getting the data from user
	void access(int userID, String pwd){  // Pass userID,password 
		
		//this.userID is Global variable
		//   password is Global variable
		this.userID   = userID; // userID local variable // We use this operator to global variable
		password = pwd;			// names are different, so we don't need to use this operator
	}
				
	void logic(){ // no parameter
		
		if (userID == 2002 && password.equals("admin") ) {
			display();
		} else {
			showError();
		}
		
		
	} //close
	
	void display(){				//Show data to the user
		System.out.println(userID + " " + password);
		
	}
	
	void showError(){
		
		System.out.println("Not valid..");
		
	}
	
}	// end of class

public class Example03 {

	public static void main(String[] args) {
		
		FaceBook ref = new FaceBook();
		ref.access(2002, "admin"); // argument 需求
		//ref.display();
		
	} // end of main

} // end of class
