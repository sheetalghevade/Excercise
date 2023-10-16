package advjavaday1;

import java.util.Scanner;

public class Replacevovels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s0 = input.nextLine();
				
		input.close();
		
		String s1=s0.toLowerCase();
		
		String s2 = s1.replace('a', 'x');
		String s3 = s2.replace('e', 'x');
		String s4 = s3.replace('i', 'x');
		String s5 = s4.replace('o', 'x');
		String s6 = s5.replace('u', 'x');
	 
	 System.out.println("String after replacing all vowels by 'x' is: " +s6);
	 
	}

}
