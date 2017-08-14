package assignMent05_LinkedHashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import sun.awt.image.ImageWatched.Link;

public class MultipleChoiceQuestion {

	public static void main(String[] args) {
		
		LinkedHashMap<String,String> ref = new LinkedHashMap<>();
		ref.put("---------------------------\n"
				+"Q1. Which statement is true ? \n"
	              +"a)Class is nothing \n"
				  +"b)Class binds all data member", "b");
		ref.put("---------------------------\n"
				+"Q2. Why we use encapsulation \n"
	              +"a)Easy to use \n"
				  +"b)Protact Data member", "b");
		ref.put("---------------------------\n"
				+"Q3. What is static? \n"
	              +"a)Static means no movement \n"
				  +"b)Static access data member directly", "b");
		
		
                // get data
		Set set = ref.entrySet(); // create set view for the LinkedHashMap
		Iterator i = set.iterator();
		Scanner sc = new Scanner(System.in);
		String choice;
		int result = 0;
		
		while(i.hasNext()) {
	         Map.Entry me = (Map.Entry)i.next();
	         System.out.println(me.getKey());
	         choice = sc.nextLine();
	         
	         if(choice.equals(me.getValue())){
	        	 result = result+2;
	         }
	         else{
	        	 System.out.println("Wrong! Correct answer :" +me.getValue()+"\n");
	         }
	      }
		
		System.out.println("Total score is : " +result);
		
	}

}
