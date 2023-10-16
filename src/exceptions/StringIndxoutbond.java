package exceptions;

import java.util.Scanner;

public class StringIndxoutbond {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = input.nextLine();
		System.out.println("Enter substring to check");
		
		String s2 = input.nextLine();
		
	
		input.close();
		
		int index = s1.indexOf(s2);
		
		if(index < 0){
			throw new StringIndexOutOfBoundsException("String index out of bound"); 
		}
		else {
		System.out.println("Index of Substring is: " +index);
		}
		
		}

}
