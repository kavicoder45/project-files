package session;
//-ea to enable assertion
//- to disable assertion
import java.util.*;

public class Abc {

	public static void main(String[] args) {
		Scanner read =  new Scanner(System.in);
		int a = read.nextInt();
		
		assert(a==3); 
		System.out.println("under assertion program");
		
	}
	
}
