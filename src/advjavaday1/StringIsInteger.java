package advjavaday1;

import java.util.Scanner;

public class StringIsInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  String: ");
		String s1 = input.nextLine();
		input.close();
			
	
		if(s1.matches("\\d+")) {
			System.out.println("String contains only digits");
			}
		else {
			System.out.println("String does not contains only digits");
		}
	}
}
