package assignMent04_Thread;

public class SeatReservation {

	public static void main(String[] args) {

		
		Reservation reserve = new Reservation();
		Person Teo = new Person(reserve, 2,"Teo");
		Teo.start();
		Person Agnes = new Person(reserve, 3,"Agnes");
		Agnes.start();
		Person Danny = new Person(reserve, 4,"Danny");
		Danny.start();
		Person Charles = new Person(reserve, 5,"Charles");
		Charles.start();
		Person Paul = new Person(reserve, 1,"Paul");
		Paul.start();
		Person Hannah = new Person(reserve, 2,"Hannah");
		Hannah.start();
		
	}

}


class Reservation {
	
	static int availableSeats = 7;
	
	synchronized void reserveSeat(int requestedSeats, String name){
		
		System.out.println(Thread.currentThread().getName()+" entered");
		//System.out.println("AvailableSeats:"+ );
		if(availableSeats>=requestedSeats){
			
			System.out.println(requestedSeats +" seats have booked / Total available seats are " +availableSeats);
			availableSeats = availableSeats - requestedSeats;
			System.out.println("Congrats!! **Seats are booked for you.");
			
			
		} else {
			
			System.out.println("Requested seats not available");	
		}
		System.out.println("-----------------");	
	}
	
}


class Person extends Thread{
	
	Reservation reserve;
	int requestedSeats;
	String name;
	public Person(Reservation reserve, int requestedSeats, String name) {
		this.reserve = reserve;
		this.requestedSeats = requestedSeats;
		this.name = name;
	}

	@Override
	public void run() {
		reserve.reserveSeat(requestedSeats,name);
		
		
	}
	

	
}
