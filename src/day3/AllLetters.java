package day3;

import java.util.Scanner;

public class AllLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter  String: ");
		String s1 = input.nextLine();
		input.close();
		
		s1 =s1.toLowerCase();
		
		boolean result = true;
		
		for(char ch ='a';ch <='z';ch++) {
			if(!s1.contains(String.valueOf(ch)))
			{
				result = false;
				break;
			}
			
		}
			if(result == false) {
				System.out.println("String does not contain all letters");
			}
			else {
				System.out.println("String contains all letters");
			}
			
		
	}

}
