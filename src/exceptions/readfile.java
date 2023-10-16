package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class readfile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File(
	            "C:/Users/gheva/eclipse-workspace/Excercise/src/exceptions/File1");
	   try {
		   Scanner sc = new Scanner(file);
  		 
	        while (sc.hasNextLine())
	            System.out.println(sc.nextLine());
		sc.close();
	} catch (FileNotFoundException e) {
		// TODO: handle exception
		System.out.println("File not found");
	}  	 
				
		}
	}

