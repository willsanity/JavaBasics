package day07_Inheritance;

class Driver{
	
	Driver refDriver;
	
	Driver ShowDriver(Driver d){
		
		refDriver = new Driver();
		return refDriver;
		
		
	}
	
} // end of Driver

class MySQL extends Driver{
	
	MySQL refMySQL;
	
	// covarient return type [after java 1.5 feature]
	
	MySQL showDriver(MySQL ref){  // method returns to its class level
		refMySQL = new MySQL();
		return refMySQL;
		
	}
	
}

public class Example05 {

	public static void main(String[] args) {

	}

} // end of MySQL
