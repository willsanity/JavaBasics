package day12_ExceptionHandling;


//programmer or Developer writes this class
public class DeveloperCode {

	public static void mylogic() {
		
		// try if for writing your logic
		try {
			System.out.println(10/0);
		} 
		// no statement in between try and catch
		
		catch (Exception e) {  // catch if for handle the exception
			System.out.println("Number can't devided by 0..");
		}
		
		finally{ // finally executes to close all opened files
			System.out.println("closing files..");
			System.out.println("closing sockets..");
			System.out.println("closing drivers...");
		}
		
	} // end if myLogic
	
} // end of DeveloperCode

// the main purpose of exception handling to prevent your data, to save your data.
