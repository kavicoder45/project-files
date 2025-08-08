package exception;
import java.util.*;

@SuppressWarnings("serial")
class NotSufficientAmount extends Exception{
	NotSufficientAmount(String msg){
		super(msg);
	}
}
 class Bank{
	int amount  = 500;
	
	public int withDrawalAmount(int amt) throws NotSufficientAmount {
		if(amt > amount) {
			throw new NotSufficientAmount("Not enough Amount");
		}
		else {
			return amt;
		}
	}
}

public class ExceptionHandling {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		try {
			Bank obj = new Bank();
			int n = obj.withDrawalAmount(200);
			System.out.println(n);
			
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
