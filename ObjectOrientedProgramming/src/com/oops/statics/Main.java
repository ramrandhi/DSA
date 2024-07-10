package com.oops.statics;

public class Main {

	public static void main(String[] args) {
		Human ram = new Human(24, "Ram", 1200,false);
		Human krishna = new Human(25, "krishna", 10000000, true);
		Human hanuman = new Human(25, "hanuman", 10000000, false);
		
		System.out.println(Human.population);
		System.out.println(Human.population);
		System.out.println(Human.population);
	}

}
