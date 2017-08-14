package day03_Casting_Last_in_Fo;

public class Example01_Multi_main {

	public static void main(String[] args) {
		
		main("Hello");

	}
	
	
	public static void main(String args) {
		main(100,"xyz");

	}

	public static String main(String args, int number) {
	
			return args + " "+number;

	}

	public static void main(int number, String str) {
	
		main("abc",200);

	}



}
