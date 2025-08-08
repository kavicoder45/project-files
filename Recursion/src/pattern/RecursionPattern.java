package pattern;

public class RecursionPattern {
	public static void pattern(int r,int c,int num) {
		if(num==0) {
			return;
		}
		
		if(c <= num) {
			System.out.print("*");
			pattern(r,c+1,num);
		}
		else {
			System.out.println();
			pattern(r+1,c,num-1);
		}
	}
	public static void triangle(int r,int c) {
		
		if(r==0) {
			return;
		}
		
		if(c < r) {
			System.out.print("*");
			triangle(r,c+1);
		}
		else {
			System.out.println("-");
			triangle(r-1,0);
		}
	}
	public static void main(String[] args) {
		pattern(1,1,4);
	    
	}

}
