package day03_Casting_Last_in_Fo;

public class Example04_Up_Casting {
	
	int var1 = 10;
	long var2 = var1; //implicit casting done by JVM
	
	long var3 = 200;
	int var4= (int)var3; // explicit casting done by programmer //explicit meaning narrowing down
	
	//implicit casting and explicit casting we can do based on primitive data type
	
	//up casting and down casting
	
	
	//String will always be sub-class of Object class
	String str1 = "java";
	Object obj1 = str1;		// Up casting done by JVM
	
	
	//object class is the root or parent class in Java
	
	Object obj2 = "optimum";
	String str2 = (String)obj2;		// Down casting done
			
//--------------------------------------------	
	// Auto boxing and Un-Boxing
	
	// we have topic call generic & collection framework does not support
	
	// both do not accept and primitive type.
	
	// Object --> Primitive type
	
	// Casting means conversion of either primitive data type or class or primitive <---> class
	
	int iVariable = 500;
	Integer iReference = iVariable;		// auto boxing done by JVM
	
	Double dReference = 40.50;			//Double is a class
	double dVariable = dReference;		//double is a primitive data type	// un boxing done by JVM
	
	
	
	public static void main(String[] args) {
		
		
		
	}

}
