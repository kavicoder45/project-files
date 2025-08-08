package recursionsums;

public class palindrome {
	
//	count number of zeros in the number; 
	public static long countZeros(long n, long c) {
		if(n == 0) {
			return c;
		}
		long rem = n%10;
		if(rem == 0)
		c++;
		return countZeros(n / 10, c);
		
	}
	static int palindromeNumber(int n, int sum) {
		if(n == 0) {
			return sum;
		}
		
		int rem = n % 10;
		sum = (sum * 10) + rem;
		return palindromeNumber(n/10,sum);
	}
	public static int rev(int n,int digits) {
		if(n%10 == n) {
			return n;
		}
		int rem = n % 10;
		return rem * (int)(Math.pow(10, digits-1))+rev(n / 10, digits - 1);
	}
	public static boolean palin(int n,int digits) {
		return n == rev(n,digits);
	}
	public static void main(String[] args) {
		int n  = 121;
		int digits = (int)(Math.log10(n))+1;
		
//		System.out.print(palin(n,digits));
//		System.out.println(countZeros(100000001,0));
		System.out.println(palindromeNumber(1234,0));
	}

}
