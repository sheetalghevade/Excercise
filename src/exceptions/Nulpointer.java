package exceptions;

import java.util.Scanner;

public class Nulpointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = input.nextLine();
		
	
		input.close();
			
			
			try {
				if(s1.isEmpty()) {
					throw new NullPointerException();
					
				}
				else {
					s1.toUpperCase();
					System.out.println(s1.toUpperCase());
				}
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("Null Pointer Exception: Check input string");
			
		} 	
				
	}

}
