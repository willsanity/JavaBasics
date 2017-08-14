package day07_Inheritance;

// example of Singleton Design Pattern

class Team{
	
	static Team refTeam = null;
	
	// private constructor means we can't create object of this class
	private Team(){  
		System.out.println("hello..");
		
	}
	
	public static Team getCaptian(){
		
		if( refTeam == null)
			 refTeam = new Team();			
		return refTeam;	 
		
	}
	
}


public class Example06 {

	public static void main(String[] args) {

		Team.getCaptian();
		Team.getCaptian();
		Team.getCaptian();
		
	}

}

/////////// Design Patter /////////////

// You are allow user to create one time.