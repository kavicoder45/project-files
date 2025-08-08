package session;

public class BankAccount {
	int accno;
	int balance;
	
	BankAccount(int accno,int balance)
	{
		this.accno = accno;
		this.balance = balance;
	}
	public void withDrawBalance(int amt) throws Exception
	{
		if(amt > balance)
		{
			throw new InsufficientBalanceException("Invalid amount cannot Withdraw: ");
		}
		else {
			System.out.print("Amount withDrawed Successfully");
		}
	}

}
