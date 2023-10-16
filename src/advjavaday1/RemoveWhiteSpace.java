package advjavaday1;

import java.util.Scanner;

public class RemoveWhiteSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter  String: ");
		String s1 = input.nextLine();
		input.close();
				
        System.out.println("String after removing white spaces: "+s1.replaceAll("\\s+",""));
		
	}

}
