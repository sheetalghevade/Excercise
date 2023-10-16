package exceptions;
import java.util.Scanner;
public class StringparseInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter string");
		String s1 = input.nextLine();
		
		input.close();
		
		
		int a =0;
		try {
			a = Integer.parseInt(s1);
			System.out.println(a+100);
			
		} catch (NumberFormatException e) {
			System.out.println("Catching Number format exception: Enter number");
		}
		
		System.out.println(a);
	}

}
