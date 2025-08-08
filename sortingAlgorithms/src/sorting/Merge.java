package sorting;

import java.util.Arrays;

public class Merge {
//	 this function will split the array into two parts: 
	static int[] splitArrays(int arr[]) {
		
		if(arr.length == 1) {
			return arr;
		}
		
		int mid = arr.length / 2;
		
		int[] left = splitArrays(Arrays.copyOfRange(arr, 0, mid));
		int[] right = splitArrays(Arrays.copyOfRange(arr, mid, arr.length));
		
		return merge(left,right);
		
	}
	
	static int[] merge(int[] left,int[] right) {
		
		int mix[] = new int[left.length + right.length];
		int i = 0;
		int j = 0;
		int k = 0;
		
		while(i<left.length && j<right.length) {
			if(left[i] < right[j]) {
				mix[k] = left[i];
				i++;
				
			}
			else {
				mix[k] = right[j];
				j++;
			}
			k++;
		}
		
//		if any one the element is extra: 
		while(i<left.length) {
			mix[k]=left[i];
			i++;
			k++;
		}
		while(j<right.length) {
			mix[k]=right[j];
			j++;
			k++;
		}
		return mix;
	}
	public static void main(String[] args) {
		
		int[] arr = new int[] {5,4,3,2,1};
		System.out.println(Arrays.toString(splitArrays(arr)));
		System.out.println(Arrays.toString(arr));
	}
}
