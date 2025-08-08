package sorting;

import java.util.Arrays;

public class MergeSortAlgorithms {
	
	public static void main(String[] args) {
		int[] arr  = new int[] {6,5,4,3,2,1};
		MergeInplace(arr,0,arr.length);
		System.out.println(Arrays.toString(arr));
	}
	public static void MergeInplace(int[] arr,int s,int e) {
		if(e - s == 1) {
			return;
		}
		
		int m = (e + s) / 2;
		
		MergeInplace(arr,s,m);
		MergeInplace(arr,m,e);
//		once it reach the single element: 
		MergeArray(arr,s,m,e);
	}
	public static void MergeArray(int[] arr,int s,int m,int e) {
		 int i = s;
		 int j = m;
		 int k = 0;
		 
		 int[] mix = new int[e - s];
		 
		 while(i < m && j < e) {
			 if(arr[i] < arr[j])
			 {
				 mix[k] = arr[i];
				 i++;
			 }
			 else {
				 mix[k] = arr[j];
				 j++;
			 }
			 k++;
		 }
		 
		 while( i < m) {
			 mix[k] = arr[i];
			 k++;
			 i++;
		 }
		 while(j < e) {
			 mix[k] = arr[j];
			 j++;
			 k++;
		 }
		 
//		 modify the original array: 
		 for(int l = 0;l<mix.length;l++) {
			 arr[s+l] = mix[l];
		 }
	}
}
