package codingquestions;

import java.util.Scanner;

public class CodingQuestions {
	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		int height = read.nextInt();
		int iv= read.nextInt();
		int fv = read.nextInt();
		
//		find the co-efficient of restitution: 
		int  cr = (iv / fv);
//		find the rebound height: 
		int reboundHeight = (int) (height * Math.pow(cr, 2));
		System.out.println(reboundHeight);
		
	}

}
