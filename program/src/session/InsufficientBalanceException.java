package session;
import java.lang.Exception;

public class InsufficientBalanceException extends Exception{
	InsufficientBalanceException(String Message)
	{
		super(Message);
	}

}
