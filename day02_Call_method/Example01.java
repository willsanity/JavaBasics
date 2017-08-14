package day02_Call_method;

public class Example01 {

	int var1 = 20;			// non-static variable
	static int var2 = 30;	// static variable
	
	public static void main(String[] args) {
		//System.out.println(var1);
		System.out.println(var2);
		
		// creating a object
		Example01 ref = new Example01();
		System.out.println(ref.var1);
	}
}
