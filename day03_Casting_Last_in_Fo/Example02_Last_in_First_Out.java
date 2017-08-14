package day03_Casting_Last_in_Fo;

class Mobile{
	
	public void feature(String brand){
		
		feature("4g", 350.50F);
		System.out.println(brand);
		
	}
	
	public void feature(String wifi, float price){
		
		feature(20909093);
		System.out.println(wifi+ " " +price);
		
	}

	public void feature(int mobileNumber){
	
		System.out.println(mobileNumber);
	
	
}
	
}

public class Example02_Last_in_First_Out {

	public static void main(String[] args) {

		Mobile ref = new Mobile();
		ref.feature("Singtel");
		System.out.println("Hello...");
	}

}


// LIFO (Last in First out)

