package sorting;

import java.util.Arrays;

public class CountingSort {
	public static void Counting(int[] arr)
	{
		int max = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i] > max)
			{
				max = arr[i];
			}
		}
		int countArray[] = new int[max+1];
		int output[] = new int[arr.length];
		Arrays.fill(countArray, 0); // fill the elements with zero: 
		
		for(int i=0;i<arr.length;i++)
		{
			countArray[arr[i]]++;
		}
		for(int i=1;i<countArray.length;i++)
		{
			countArray[i] = countArray[i-1] + countArray[i];
		}
		
		for(int i=arr.length-1;i>=0;i--)
		{
		   output[countArray[arr[i]] - 1] = arr[i];
		}
		System.out.print(Arrays.toString(output));
	}
	public static void main(String[] args)
	{
		int[] arr = new int[] {5,4,3,2,1};
		Counting(arr);
	}

}
