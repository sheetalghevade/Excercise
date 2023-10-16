package oops;

public class ConsoleLogger implements Logger {

	@Override
	public void log(String message) {
		// TODO Auto-generated method stub
		System.out.println(" New Message: " +message);
	}

}
