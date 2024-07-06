package basics;

public class Palendrome {
	public static void main(String[] args) {
//		StringBuilder str = new StringBuilder("abcdcba");
//		StringBuilder str2 = new StringBuilder();
//		for(int i=str.length()-1;i>=0;i--) {
//			str2.append(str.charAt(i));
//		}
//		if(str.toString().equals(str2.toString())) {
//			System.out.println("Palendrome");
//		} else {
//			System.out.println("not a Palendrome");
//		}
		
		String str = "g";
		if(isPalendrome(str)) {
			System.out.println("str is palendrome");
		} else {
			System.out.println("str not a palendrome");
		}
	}
	
	public static boolean isPalendrome(String str) {
		int left = 0;
		int right = str.length()-1;
		while(left < right) {
			if(str.charAt(left) != str.charAt(right)) {
				return false;
			}
			left++;
			right--;
		}
		return true;
	}
}
