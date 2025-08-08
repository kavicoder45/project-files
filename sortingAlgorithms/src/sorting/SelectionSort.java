package sorting;

import java.util.Arrays;

public class SelectionSort {
	static int getMaxIndex(int[] arr,int start,int end) {
	int max = start;
	for(int i=1;i<=end;i++)
	{
		if(arr[i] > arr[max])
		{
			max = i;
		}
	}
	return max;
		
	}
	static void getSwap(int last,int max,int[] arr)
	{
		int temp = arr[last];
		arr[last] = arr[max];
		arr[max] = temp;
	}
	public static void main(String[] args)
	{
		int[] arr = new int[] {0,-34,34,23,-65};
		
		for(int i=0;i<arr.length;i++   )
		{
			int last = arr.length - i - 1;
			int max = getMaxIndex(arr,0,last);
			getSwap(last,max,arr);
		}
		
		System.out.print(Arrays.toString(arr));
	}
}
