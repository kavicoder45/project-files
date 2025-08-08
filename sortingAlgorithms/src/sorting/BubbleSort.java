package sorting;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args)
	{
	 int[] arr = new int[] {1,2,3,4,5};
	 int n = arr.length;
	 
	 boolean  swapped;
	 
	 for(int i=0;i<n;i++)
	 {
		 swapped = false;
//		 to achieve a swapped array bubble sort should compare the (n*(n-1)/2) swap: 
		 for(int j=1;j<n-i;j++)
		 {
			 if(arr[j] < arr[j-1])
			 { 
				 int temp = arr[j-1];
				  arr[j-1] = arr[j];
				  arr[j] = temp;
				  swapped = true;
			 }
		 }
		 if(!swapped)
			 break;
	 }
	 
	 
	 System.out.print(Arrays.toString(arr));
	 
	}

}
