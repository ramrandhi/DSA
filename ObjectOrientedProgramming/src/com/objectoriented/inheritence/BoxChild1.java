package com.objectoriented.inheritence;

public class BoxChild1 extends Box{
	double width;
	
	
	public BoxChild1() {
		this.width = -2;
	}
	
	public BoxChild1(double h, double l, double w, double kk) {
		super(h,l,w);
		this.width = kk;
		
	}
	
	public static void main(String[] args) {
		BoxChild1 bb = new BoxChild1();
		System.out.println(bb.weight);
	}
	
	
	
//	   LEARNINGS:
	   
//	   1. accessing an object is dependent on reference variable and not in object.
//	   Example :
//	   Box b = new BoxChild1(double height, double length, double weight, double kk);
	
//		In the above example the reference to which the object data should be accessed is dependent on reference variable but Box
//		class has constructor with only 3 parameters passed so it is giving an error when we pass 4 parameters
	
	BoxChild1 bldffg = new BoxChild1(height, length, weight, width);

}
