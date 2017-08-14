package day02_Call_method;

public class Example05 {

	public static void main(String[] args) {

		Bank ref = new Bank();
		ref.setBankCode(111);
		ref.setBankName("DBS");
		
		System.out.println("The bank code is: " + ref.getBankCode() + " The bank name is: " + ref.getBankName());
		
	}

}
