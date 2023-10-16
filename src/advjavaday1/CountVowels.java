package advjavaday1;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  String: ");
		String s1 = input.nextLine();
		input.close();
		
		String s2= s1.toLowerCase();
		int a= s2.length();
		int count =0;
		for(int i=0;i<a;i++) {
			if(s2.charAt(i) == 'a' || 
			   s2.charAt(i) == 'e' || 
			   s2.charAt(i) == 'i' || 
			   s2.charAt(i) == 'o' ||
			   s2.charAt(i) == 'u')
			{
				count++;
			}
		}
		
		System.out.println("The total number of vovels in string is: "+count);
	}

}






