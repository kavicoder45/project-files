package binarysearch;
public class FindPivot {
	
	public static int FindingPivot(int[] arr) {
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		
		while(start<end) {
			
			int mid = start + (end - start)/2;
			
			if( mid < n && arr[mid] > arr[mid + 1]) {
				return mid;
			}
			else if(mid < n && arr[mid] < arr[mid - 1]) {
				return mid - 1;
			}
			else if(arr[start] >=arr[mid]) {
				end = mid - 1;
			}
			else {
				start = mid + 1;
			}
		}
		
		return -1;
	}
	public static void main(String[] args) {
		
		int[] arr = new int[] {4,5,6,0,1,2,3};
		System.out.println(FindingPivot(arr));
	}

}
