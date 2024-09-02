package com.oops.interfaces;

public class Car implements Engine, Brake, Media {
	
	//Through Interfaces we can achieve multiple inheritence
	// Because eventhrough interfaces have same there is no body and body is implemented here and there will be no issue

	@Override
	public void brake() {
		System.out.println("I Brake like a normal car");
	}

	@Override
	public void start() {
		System.out.println("I Start like a normal car");
		
	}

	@Override
	public void stop() {
		System.out.println("I Stop like a normal car");
		
	}

	@Override
	public void acc() {
		System.out.println("I Accelerate like a normal car");
		
	}

}
