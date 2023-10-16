package oops;

public class SavingsAccount extends BankAccount implements Interest{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit in Savings account");
	}

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
		System.out.println("Withdraw from Savings account");
	}

	
	@Override
	public void calculateInterest() {
		// TODO Auto-generated method stub
		System.out.println("Interest on Savings account");
	}
}
