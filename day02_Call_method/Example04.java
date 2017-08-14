package day02_Call_method;


class User{
	
	void showUser1(int number){
		System.out.println(number);
		
	}
	
	String showUser2(){
		
		return "user2";
	} // showUser2
	
	String showUser3(){
		
		return 1234 + " "+"user3";
	} // showUser3
	
	int showUser4(int userID){
		return userID;
	}
	
	double showUser5(float salary){
		return salary;
	} // showUser5
	
	String showUser6(int age, String name, float salary){
		
		return age + " " +name +" " +salary;		
	}
	
} // end of class

public class Example04 {

	public static void main(String[] args) {
		
		User ref = new User();
		ref.showUser1(100);
		// int temp = ref.showUser4(200);
		// System.out.println(temp);

		System.out.println(ref.showUser4(200));

	}

}
