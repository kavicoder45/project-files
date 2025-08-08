package binarysearch;

public class RBS {
	
	public static int findElement(int[] arr,int start,int end,int target) {
		
		if(start > end) {
			return -1;
		}
		int mid = start + (end - start) /2;
		
		
		if(arr[mid] == target) {
			return mid;
		}
		
		if(arr[start] <= arr[mid]) {
			
			if(target >=arr[start]&& target<=arr[mid]) {
				return findElement(arr,start,mid-1,target);
			}
			else {
				return findElement(arr,mid+1,end,target);
			}
		}
		
		if(target>=arr[mid] && target<=arr[end]) {
			return findElement(arr,mid+1,end,target);
		}
		
			return findElement(arr,start,mid-1,target);
	}
	
	public static void main(String[] args) {
		
		int arr[] = new int[] {5,6,7,8,9,1,2,3};
		int n = arr.length;
		System.out.println(findElement(arr,0,n-1,3));
		
	}

}
