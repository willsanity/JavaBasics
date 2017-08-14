package file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter1 {

	public static void main(String[] args) {

		try{ //warning: exceptions possible
			
			boolean newFile = false;
			//c:\\file\\demo.txt
			File f = new File("abcxyz.doc"); // look for a file
			System.out.println(f.exists());// look for a real file // false
										//true
			newFile = f.createNewFile();//If not exist then create a file!
			System.out.println(newFile);//already there? // true false
			System.out.println(f.exists());//look again */ // true false
			
			FileWriter fw = new FileWriter("abcxyz.doc"); // open existing file
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write("this is filewriter7");
			//br.flush();
			br.newLine();
			//br.flush();
			br.write("thank you...");
			br.newLine();
			br.write("Java");
			br.newLine();
			br.write("SAP");
			br.newLine();
			br.write(".Net");
			
			br.close();
			
			FileReader fr = new FileReader("abcxyz.doc");
			
			//To store the contents read via File Reader
			BufferedReader brRead = new BufferedReader(fr);
			
			//Read br and store a line in  'data', print data
			String s1 = null;
			while ((s1=brRead.readLine()) !=null) {
				
				System.out.println(s1);
				//fr.close();
				
			}
			
		} catch (IOException e){
			
			
			
		}

  }

}