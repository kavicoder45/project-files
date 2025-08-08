package arrayrecursionqa;

import java.util.ArrayList;
import java.util.List;

public class ArrayRecursion {
	
	public static void main(String[] args) {
		
		int[] arr  = new int[] {1,2,7,4,4,4};
//		System.out.println(checkSorting(arr,0));
		List<Integer> result = new ArrayList<>();
		
		System.out.println(findAllIndex(arr,0,4,result));
		
		
	}
	
	
//	check whether array is sorted or not: 
	static boolean checkSorting(int arr[],int index)
	{
//		base condition:
		if(index == arr.length - 1) {
			return true;
		}
		
		return arr[index] < arr[index + 1] && checkSorting(arr,index + 1);
	}
	
//	find element in the array: 
	static int findElement(int[] arr,int index,int target) {
		if(index == arr.length) {
			return -1;
		}
		
		if(arr[index] == target) {
			return index;
		}
		
		return findElement(arr,index+1,target);
	}
//	we have to find all index of Target: 
	static List<Integer> findAllIndex(int[] arr,int index,int target,List<Integer> result) {
		if(index == arr.length) {
			return result;
		}
		if(arr[index] == target) {
			result.add(index);
		}
		
		return findAllIndex(arr,index+1,target,result);
	}
	
}
