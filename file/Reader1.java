package file;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

//we have two type of file, absolute path and relative path.

//file in local disk, inside the drive & folder, we name it as Absolute path.

//Distributed or centralize File, that location we name it as Relative path.
public class Reader1 {

	public static void main(String[] args) {

		try{
			// Open the file that is the first command line parameter
			FileInputStream fs = new FileInputStream("c:\\file\\heyhey.docx");//absolute path
			//FileInputStream fs = new FileInputStream("gg.txt"); //relative path
			//c:\\MyFile.txt absolute path
			//Get the object of DataInputStream
			DataInputStream in = new DataInputStream(fs);
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			
			String str;
			
			//Read File Line by Line
			while( (str = br.readLine()) !=null) {
			//print the content on the console
				System.out.println(str);
				
			}
			
			//Close the input stream
			in.close();
		}catch(Exception e){ //Catch exception if any
				
				//System.err.println("Error: " +e.getMessage()); //System.err to show error
			
				System.out.println("file not found...");
			}
		}
		
	}


