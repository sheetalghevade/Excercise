package advjavaday1;

import java.util.Scanner;

public class Longestword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter  String: ");
		String s1 = input.nextLine();
		input.close();

		
		String words[] = s1.split("\\s+");
		int b= words.length;
		
		if (b==1) {
			System.out.println("The longest word in given string is: "+s1);
			System.out.println("The Length of longest word in given string is: "+s1.length());
		}
		
		else {

		
		String temp = null;
		for(int i=0;i<b;i++) {
			for(int j=1;j<b-i;j++) {
				if(words[j-1].length() > words[j].length()) {
					temp = words[j-1];
					words[j-1] = words[j];
					words[j] = temp;
				}
			}
		}
			
		System.out.print("The longest word/s in given String is/are: ");
		for(int i=b-1;i>0;i--) {
			if(words[b-1].length() == words[i].length())
			{	
				System.out.print(words[i] +", ");
			}
			
			}
		System.out.println("\nlength of longest word/s is/are: " +words[b-1].length());
		}
		
	}

}
