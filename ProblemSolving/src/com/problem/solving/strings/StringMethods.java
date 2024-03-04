package com.problem.solving.strings;

public class StringMethods {
	public static void main(String[] args) {
		String str = "Hellow Hp engine";
		String s = "Hellow hp engine";
		boolean bool = str.contains(s);
		boolean boo = str.matches(s);
		if(boo) {
			System.out.println("true");
		} else {
			System.out.println("False");
		}
	}
}
