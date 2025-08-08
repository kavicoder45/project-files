package pattern;

import java.util.Arrays;

public class SelectionRecursion {
	
	public static void swapElement(int[] arr,int r,int c,int max) {
		
		if(r==0) {
			return;
		}
		if(c < r) {
			if(arr[c] > arr[max]) {
				max = c;
				swapElement(arr,r,c+1,max);
			}
			else {
				swapElement(arr,r,c+1,max);
			}
		}
		else {
			int temp = arr[r-1];
			arr[r-1] = arr[max];
			arr[max] = temp;
			swapElement(arr,r-1,0,0);
		}
		
	}
	public static void main(String[] args) {
		int arr[] = new int[] {4,3,2,1};
	    swapElement(arr,4,0,0);
		System.out.println(Arrays.toString(arr));
	}

}
