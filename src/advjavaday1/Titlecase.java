package advjavaday1;

import java.util.Scanner;

public class Titlecase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);
		System.out.println("Enter  String: ");
		String s1 = input.nextLine();
		input.close();
		
		String arr[] = s1.split(" ");
		for(int i=0; i<arr.length;i++) {
		arr[i]=	arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1);
		}
		
		System.out.print("Title Case of input string is: ");
		for(int i=0; i<arr.length;i++) {
                   System.out.print(arr[i] +" ");
		}
	}

}
