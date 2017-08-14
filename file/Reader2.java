package file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader2 {

	public static void main(String[] args) {

		try {
			
			//Get data from this file using a file reader.
			FileReader fr = new FileReader("MyFile.txt");
										//c;\\file\\demo.txt
			//To store the contents read via File Reader
			BufferedReader br = new BufferedReader(fr);
			
			//Read br and store a line in 'data', print data
			String s;
			while ((s = br.readLine()) != null) {
				
				System.out.println(s);
				//fr.close();
			}
		} catch (IOException e) {

			System.out.println("Sorry!! File not found...");
		}
		
	}

}
