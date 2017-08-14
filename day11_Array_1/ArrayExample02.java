package day11_Array_1;

import java.util.Scanner;

public class ArrayExample02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number");
		int num = Integer.parseInt(sc.nextLine());
		Example02Con ar[] = new Example02Con[num];
		
		for (int i = 0; i < num; i++) {
			System.out.println("Enter name");
		String nam = sc.nextLine();
			System.out.println("Enter age");
		int age = Integer.parseInt(sc.nextLine());
			
			Example02Con ref = new Example02Con();
			ref.setAge(age);
			ref.setNam(nam);
						
			ar[i] = ref;
			
		}
		
		for (int i = 0; i < ar.length; i++) {
			System.out.println(ar[i]);
		}
	}

}
