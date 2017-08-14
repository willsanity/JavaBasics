package sortData_Pai_Xu;

public class Person {

	String name;
	int age;
	public Person(String string, int i) {
		
		name=string;
		age=i;
		
	}
		
	@Override
	public java.lang.String toString() {
		// TODO Auto-generated method stub
		return name+" "+ age;
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


