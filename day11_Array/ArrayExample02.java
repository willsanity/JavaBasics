package day11_Array;

import java.util.Scanner;

public class ArrayExample02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number");
		int number = Integer.parseInt(sc.nextLine()) ;
		
		Example02 ex[] = new Example02[number];
		
		for (int i = 0; i < number; i++) {
			System.out.println("Enter Name");
		String name = sc.nextLine();	
			System.out.println("Enter Age");
		int age = Integer.parseInt(sc.nextLine()); 
		
		//Example02 ref = new Example02(name, age);
		//ex[i] = ref;
		
		Example02 ref = new Example02();
		ref.setAge(age);
		ref.setName(name);
		ex[i] = ref;
		
		}
		
		for (int i = 0; i < ex.length; i++) {
		
			System.out.println(ex[i]);
		}
	
		
		
		
	}

}
