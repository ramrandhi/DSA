package com.basics.enums;

public class Basic {
	enum Week {
		Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
//		these are enum constants
//		by default these are public, static and final
//		since it is final you cannot create child enums
//		type is week
		
		Week(){
			System.out.println("constructor called for " + this);		
		}
	}

	public static void main(String[] args) {
		Basic basic = new Basic();
		Week week = Week.Monday;
//		for (Week day : week.values()) {
//			System.out.println(day);
//		}

	}
}
