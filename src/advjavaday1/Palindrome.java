package advjavaday1;

import java.util.Scanner;
public class Palindrome {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
//		Taking input from User

		Scanner input = new Scanner(System.in);
		System.out.println("Enter String: ");
		String s1 = input.nextLine();
		
		input.close();
		
	s1.replaceAll("\\s+","");
		
		char s2[] = s1.toCharArray();
		int a =s1.length();
		boolean is_pelindrom = true;
			for (int i=0;i<a;i++)
			{
			 if(s2[i] != s2[a-i-1])
			 {
		      is_pelindrom = false;
			  	 break;
			 }
			}
			if (is_pelindrom == true)
			{
				System.out.println("the entered string is a palindrom");	
			}
			else {
				System.out.println("the entered string is not a palindrom");
			}
	
				
	}

}
