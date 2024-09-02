package com.basics.object.cloneing;

public class Human implements Cloneable {
	int age;
	String name;
	int[] arr = new int[] {1,4,6,5,5};
	
	public Human(int age, String name) {
		this.age = age;
		this.name = name;
		this.arr = new int[] {3,6,9,5,1};
	}
	
//	public Human(Human other) {
//		this.age = other.age;
//		this.name = other.name;
//	}
	
	public Object clone() throws CloneNotSupportedException {
		// this is shallow copy
//		return super.clone(); // this is shallow copy
		
//		Deep copy
		Human twin = (Human) super.clone();
		twin.arr = new int[twin.arr.length];  // here we are creating a new object so a new object reference is created.
		for(int i =0; i<arr.length;i++) {
			twin.arr[i] = this.arr[i];
		}
		return twin;
	}
}
