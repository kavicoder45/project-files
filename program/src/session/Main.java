package session;

public class Main{
 public static void main(String[] args)
 {
	 BankAccount  person = new BankAccount(123,120);
	 
	 try {
		 person.withDrawBalance(100);
	 }
	 catch(Exception e)
	 {
		 System.out.println(e.getMessage());
	 }
 }
}