package strings;
import java.util.*;

public class SubSequence {
	static List<String> ListSubsequence(String p,String up)
	{
		if(up.isEmpty()) {
			List<String> result = new ArrayList<>();
			result.add(p);
			return result;
		}
		char ch = up.charAt(0);
		List<String> left = ListSubsequence(p+ch,up.substring(1)) ;
		List<String> right = ListSubsequence(p,up.substring(1));
		
		left.addAll(right);
		return left;
	}
	static void subsequence(String p,String up) 
	{
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		
		char ch = up.charAt(0);
		subsequence(p+ch,up.substring(1));
		subsequence(p,up.substring(1));
	}
	static void printASCIIValue(String p,String up)
	{
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		char ch = up.charAt(0);
		printASCIIValue(p+ch,up.substring(1));
		printASCIIValue(p,up.substring(1));
		printASCIIValue(p+(ch+0),up.substring(1));
	}
//	using iterative approach: 
	static List<List<Integer>> Iterative(int arr[]){
		
		List<List<Integer>>outer = new ArrayList<>();
		outer.add(new ArrayList<>());
		for(int num : arr) {
			int n = outer.size();
			for(int i=0;i<n;i++) {
				List<Integer> inner = new ArrayList<>(outer.get(i));
				inner.add(num);
				outer.add(inner);
			}
		}
		return outer;
	}
	static List<List<Integer>> subsetDuplicate(int arr[]){
		
		List<List<Integer>>outer = new ArrayList<>();
		int start = 0;
		int end = 0;
		outer.add(new ArrayList<>());
		
		for(int i=0;i<arr.length;i++){
			start = 0;
			
			if(i > 0 && arr[i] == arr[i-1]) {
				start = end + 1;
			}
			end = outer.size() - 1;
			int n = outer.size();
			for(int j=start;j<n;j++) {
				List<Integer> inner = new ArrayList<>(outer.get(j));
				inner.add(arr[i]);
				outer.add(inner);
			}
		}
		return outer;
	}
	public static void main(String[] args) {
		int arr[] = new int[] {1,2,2};
		List<List<Integer>> ans = subsetDuplicate(arr);
		for(List<Integer> x : ans) {
			System.out.println(x);
		}
	}

}
