package recursionsums;

import java.util.Arrays;

public class BubbleRecursion {
	
	public static void swapElement(int[] arr,int r,int c) {
		if(r==0) {
			return;
		}
		
		if(r < c) {
			if(arr[c] > arr[c+1]) {
				int temp = arr[c];
				arr[c] = arr[c+1];
				arr[c+1] = temp;
			}
		  swapElement(arr,r,c+1);
		}
		else {
			swapElement(arr,r+1,0);
		}
	}
	
	public static void maina(String[] args) {
		int arr[] = new int[] {4,3,2,1};
		swapElement(arr, 4, 0);
		System.out.println(Arrays.toString(arr));
	}

}
