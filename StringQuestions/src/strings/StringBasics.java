package strings;

public class StringBasics {
	
	static void skipString(String p,String up) {
		if(up.isEmpty()) {
			System.out.println(p);
			return;
		}
		if(up.charAt(0)=='a') {
			
			skipString(p,up.substring(1));
		}
		else {
			char ch = up.charAt(0);
			skipString(p + ch,up.substring(1));
		}
	}
//	alternate method: 2: 
	static String skipString2(String str) {
		if(str.isEmpty()) {
			return "";
		}
		
		char ch = str.charAt(0);
		if(ch=='a') {
			return skipString2(str.substring(1));
		}
		else {
			return ch + skipString2(str.substring(1));
		}
	}
//	skip entire string: 
	static String skipApple(String str) {
		if(str.isEmpty()) {
			return "";
		}
		char ch = str.charAt(0);
		
		if(str.startsWith("apple")) {
			return skipApple(str.substring(5));
		}
		else {
			return ch + skipApple(str.substring(1));
		}
	}
	
	static String skipNotApple(String str) {
		if(str.isEmpty()) {
			return "";
		}
		char ch = str.charAt(0);
		
		if(str.startsWith("app") && !str.startsWith("apple")) {
			return skipNotApple(str.substring(3));
		}
		else {
			return ch + skipNotApple(str.substring(1));
		}
	}
	public static void main(String[] args) {
		String up = "bccappledda";
		System.out.println(skipNotApple(up));
	}
}
