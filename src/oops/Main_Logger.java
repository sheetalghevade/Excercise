package oops;

public class Main_Logger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConsoleLogger c = new ConsoleLogger();
		c.log("This is a Console Logger message");
		
		FileLogger f = new FileLogger();
		
		f.log("This is a File logger message");
		
		
	}

}
