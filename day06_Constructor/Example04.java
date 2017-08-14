package day06_Constructor;

class Student {
	
	private String studentName;
	
	// solution 1
	/*Student(String studentName){
		this.studentName = studentName;
	}*/

	// solution 2
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	
	@Override
	public String toString() { // converts object to string format
		return studentName + " " +12345; // returns in the form of object
	} // end of toString
	
	
}// end of class


public class Example04 {

	public static void main(String[] args) {

	//	Student refStudent = new Student("James");
		Student refStudent = new Student();
		refStudent.setStudentName("James");
		System.out.println(refStudent); // print reference of the class
		
	}

}
