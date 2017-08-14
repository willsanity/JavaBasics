package assignMent03_Interface;

import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.zip.InflaterInputStream;

public class SalesApplication {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Key in");
		
		MVC obj  = BusinessLogic.deal(sc.nextLine());
		
		obj.show();
		
		
	}

}
