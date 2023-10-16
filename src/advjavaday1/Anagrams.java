package advjavaday1;

import java.util.Scanner;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st String: ");
		String s1 = input.nextLine();
		
		System.out.println("Enter 2nd String: ");
		String s2 = input.nextLine();
		
		input.close();
		int a = s1.length();
		int b = s2.length();
		char arr1[] = s1.toCharArray();
		char arr2[] = s2.toCharArray();
		
		boolean result =true;
		if(a == b)
		{
		  Arrays.sort(arr1);
		  Arrays.sort(arr2);
		   for(int i=0;i<arr1.length;i++)
		   {
		   if(arr1[i] != arr2[i]) {
				   result = false;
				   break;
			   }
		   
		   }
		   if(result == false) {
			   System.out.println("Entered strings are not Anagrams");
		   }
		   else
			   System.out.println("Entered strings are  Anagrams");
		}
			
		else
		{
			System.out.println("Entered Strings are not Anagrams");
		}
	}

}
