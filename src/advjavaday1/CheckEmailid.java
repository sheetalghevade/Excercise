package advjavaday1;

import java.util.Scanner;
//import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.*;

public class CheckEmailid {

	 public static boolean isValid(String email)
		    {
		        String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
		                            "[a-zA-Z0-9_+&*-]+)*@" +
		                            "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
		                            "A-Z]{2,7}$";
		                              
		        
		        
// ^[A-Za-z0-9+_.-]+@([A-Za-z0-9.-]+)\\.[A-Za-z]{2,4}$
		        
		        
		        Pattern pat = Pattern.compile(emailRegex);
		        if (email == null)
		            return false;
		        return pat.matcher(email).matches();
		    }
		  
		    public static void main(String[] args)
		    {
		     	Scanner input = new Scanner(System.in);
				System.out.println("Enter  emailid: ");
				String s1 = input.nextLine();
				input.close();
				
		        ArrayList<String> address = new ArrayList<>();
		            
		          address.add(s1);
		         		            
		        for(String i : address){
		            if (isValid(i))
		                System.out.println("True");
		            else
		                System.out.println("False");
		        }
		    }
		}

