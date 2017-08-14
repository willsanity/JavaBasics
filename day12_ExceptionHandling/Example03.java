package day12_ExceptionHandling;

public class Example03 {

	public static void main(String[] args) {
		
		try {
			
			A refA = null;
			refA.showA();
			
		} catch (NullPointerException e) {

			System.out.println("cant be called through null..");
		}
		
		catch (Exception e) {

		}

		
	}

}
