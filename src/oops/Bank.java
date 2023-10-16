package oops;

public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckingAccount c = new CheckingAccount();
		
		c.deposit();
		c.withdraw();
		System.out.println();
		
		SavingsAccount s = new SavingsAccount();
		
		s.deposit();
		s.withdraw();
		System.out.println();
		s.calculateInterest();
				
	}

}
