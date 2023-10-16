package exceptions;

public class ArithmaticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a = 30;
		int b =0;
		int c = 0;
		try {
			c = a/b;
		} catch (ArithmeticException e1) {
			System.out.println("Cannot divide by zero");
		 }
	
		System.out.println(c);
							
		int sum = a+b;
		System.out.println("Sum of two numbers: "+sum);
     }
	}

