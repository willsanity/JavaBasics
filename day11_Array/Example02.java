package day11_Array;

public class Example02 {

	String name;
	
	int	age;
	

/*	public Example02(String name, int age) {

		this.name = name;
		this.age = age;
	}*/
	
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + " "+ age;
}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
}
