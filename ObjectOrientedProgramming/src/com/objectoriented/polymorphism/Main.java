package com.objectoriented.polymorphism;

public class Main {

	public static void main(String[] args) {
		Box box = new BoxMatch();

		System.out.println(box.area());
		
//		here box that is main class tells about the where it can have access and the BoxMatch tells about the from class 
//		 you need to take the method from. also know as upcasting.
		
//		IMPORTANT: Here we need have size() method in both in Box class and in BoxMatch class as accessing mathod the parent
//		 class looks for the method first in parent class and look for any method overrides and looks that method in child class.
	}

}
