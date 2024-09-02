package com.basics.object.cloneing;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws CloneNotSupportedException{
		Human human = new Human(34, "andrewww");
		Human twin = (Human) human.clone();
		System.out.println(twin.age+ " "+ twin.name);
		
		twin.arr[0] = 105;
		
		System.out.println(Arrays.toString(human.arr));
		System.out.println(Arrays.toString(twin.arr));
	}
	
	/*
	 	
	 	For Human class to make the class clonable we need to Implement the interface Clonable and then create a object reference to
	 	the constructor and create a clone method with return type as object and 
	 	
	 	
	 	
	 	
	 */

}
