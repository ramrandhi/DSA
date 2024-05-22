package basics;

public class StringMethods {
	public static void main(String[] args) {
		String str = "rangoli";
		String s = "gill";
		System.out.println(str.charAt(2));
		System.out.println(str.codePointAt(1));
		System.out.println(str.codePointBefore(2));
		System.out.println(str.codePointCount(5,7));
		System.out.println(str.compareTo(s));
		System.out.println(str.compareToIgnoreCase(s));
		System.out.println(str.concat(s).length());
		System.out.println(str.trim());
		System.out.println(str.contentEquals(s));
		System.out.println(str.contains(s));
	}

}
