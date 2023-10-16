package oops;

public class PassingMainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
PassingNoString in =new PassingNoString();
  String output = in.display();
String string_change = "Java";

String input = output.replace("programming languages","string_change" );


PassingString pass_string = new PassingString();
pass_string.display(input);


	}

}
