package day07_Inheritance;

class GrandFather{
	
	void showGrandFather(){
		System.out.println("Hard working");
		
	}
}// end of Grand Father

class Father extends GrandFather{
	
	void showFather(){
		
		System.out.println("Honest");
	}
	
}// end of father

class MyClass extends Father{
	
	void showMyClass(){
		
		showGrandFather();
		showFather();
	}
	
}


// using inheritance don't have to create object

//inheritance is reusbility of the code.

public class Example01 {

	public static void main(String[] args) {
		
		MyClass ref = new MyClass();
		
		ref.showMyClass();

	}

}
