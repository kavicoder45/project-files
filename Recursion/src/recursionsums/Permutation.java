package recursionsums;

import java.util.List;
import java.util.*;

public class Permutation {
	public static void main(String[] args) {
		
		
		List<String> result = permutation("","abc");
		System.out.println(result);
		
	}
	static List<String> permutation(String p , String up) {
		 
		if(up.isEmpty()) {
		List<String> result = new ArrayList<>();
		result.add(p);
		return result;
		}
		
		char ch = up.charAt(0);
		List<String> ans = new ArrayList<>();
		
		for(int i=0;i<=p.length();i++) {
			String first = p.substring(0,i);
			String end = p.substring(i,p.length());
			List<String> allElement= permutation(first+ch+end,up.substring(1));
			ans.addAll(allElement);
		}
		
		return ans;
	}
}
