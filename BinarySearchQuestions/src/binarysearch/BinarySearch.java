package binarysearch;

public class BinarySearch {
	static int findCeil(int[] arr,int target) {
	    
		int start = 0;
		int end = arr.length -1;
		while(start<=end) {
		  
			int mid = start + (end - start)/2;
			
			if(arr[mid] == target) {
				return arr[mid];
			}
			else if(target > arr[mid]) {
				start = mid + 1;
				
			}
			else {
				end = mid - 1;
			}
		}
		return arr[start];
	}
//	to find the floor of a number simply return the arrr[end]: 
	/*
	 * we should know once the loop is violated: the variable become e->ans->start;
	 */
	public static void main(String[] args) {
		int[] arr = new int[] {3,4,5,7,8,9,10};
		int target = 8;
		System.out.println(findCeil(arr,target));
	}

}
