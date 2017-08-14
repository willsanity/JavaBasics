package day08_Abstract_interface;
/* 2 different [abstract] classes
 * same methods myDriverOracle() under [abstract] classes
 * 
 */
abstract class Oracle{
	abstract void myDriverOracle(); //[abstract] myDriverOracle() method
	
	
}
/*Anonymous inner class*/
/* MicroSoft and Oracle can't have IS-A relationship*/
abstract class MicroSoft{
	abstract void myDriverMicroSoft();//[abstract] myDriverOracle() method
	
}

class Driver extends MicroSoft{

	@Override
	void myDriverMicroSoft() { //Override myDriverOracle() method
		
		System.out.println("MicroSoft Driver implemented..");
	}
	
	// how to implement myDriverOracle() from Oracle...
	Oracle oRef = new Oracle() {
		
		@Override
		void myDriverOracle() { //Override myDriverOracle() method
			
			System.out.println("Oracle Driver implemented..");

		}
	};

}



public class AbstractClassExample03 {

	public static void main(String[] args) {

		// call both the methods
		
		Driver dRef = new Driver();
		dRef.myDriverMicroSoft();
		dRef.oRef.myDriverOracle();
		
			
		
		
	}

}
