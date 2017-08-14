package day11_Array;

class UserData{
	void showData(Object ref[]){
	
		for (Object object : ref) {
			System.out.println(object);
		}
		
	}
} // end of UserData

public class ArrayExample {

	public static void main(String[] args) {

		UserData ref = new UserData();
		
		int iVariable[] = {3,5,7,9};
		
		// Integer to Object
		Integer iRef[] = {3,5,7,9};
		String refString[] = {"data1", "data2", "data3"};
		
		ref.showData(refString);
		ref.showData(iRef);

		/*for (String temp : refString) { // get all the record from String
			System.out.println(temp);			
		}
		
		for (int temp : iVariable){ // get all the records from int
			System.out.println(temp);
		}*/
	}

}
