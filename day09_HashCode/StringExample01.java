package day09_HashCode;

public class StringExample01 {

	public static void main(String[] args) {

		String str1 = "java";
		String str2 = "java";
		String str3 = new String("java");
		
		if (str1 .equals(str2)){
			
			System.out.println(true);
								
		}	else	{
			System.out.println(false);
		}
	
		//both are pointing to heap memory. String str1 & str 2 is inside string constance pool 
		
	}

}
