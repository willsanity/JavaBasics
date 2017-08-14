package day04_CommandLine_Argument;

public class CommandLineArgumentExample {

	public static void main(String[] malvin) {
		
		String temp[] = malvin;
	
		
	/*	for( int i=0; i<malvin.length;i++){
			
			System.out.println(temp[0]);*/
		switch(temp[0]){
		
		case "japan":
			System.out.println("welcome to " +temp[0]);
			break;
		case "china":
		System.out.println("welcome to " +temp[0]);
			break;
		case "singapore":
			System.out.println("welcome to " +temp[0]);
				break;
		default:
			System.out.println("Sorry!!!");
			break;
		}
		
	}

}
