package oops;

public class CheckingAccount extends BankAccount{

	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		System.out.println("Deposit in Checking account");
	} 

	@Override
	public void withdraw() {
		// TODO Auto-generated method stub
		
		System.out.println("Withdraw from Checking account");
	}
}
