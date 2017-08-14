package day13_Exception_Throw;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class GetData{
	
	static void getUserData() throws IOException{  //SQLException, FileNotFoundException...
		
		BufferedReader brRef = new BufferedReader(new InputStreamReader(System.in)); //It's a class store an object.
		System.out.println("enter name: ");
		
		String name = brRef.readLine();
		
	}
	
}

public class ThrowsExample {

	public static void main(String[] args) throws IOException {

		GetData.getUserData(); // throw is check exception , catch is uncheck exception
		
	}

}
