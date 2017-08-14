package assignMent03_Interface;

public class BusinessLogic {

	public static MVC deal (String str){
		
		
		switch (str){
			
		case "Vehicle": 
		
			return new Vehicle();
			
		case "Plane": 
			return new Plane();
		case "Train": 
			return new Train();
		case "Boat": 
			return new Boat();
		default:
			return new Nodata();
		
		
		
		
		
		}
		
		
	}
	
}
