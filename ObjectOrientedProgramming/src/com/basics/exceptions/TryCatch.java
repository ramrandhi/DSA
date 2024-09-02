package com.basics.exceptions;

public class TryCatch {
	public static void main(String [] args) {
		int a = 5;
		int b = 0;
		
		try {
			System.out.println(divide(a,b));;
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			System.out.println("This block will execute no metter what .. ");
		}
	} 
	
	public static int divide (int a, int b) throws Exception {
		if(b == 0) {
			throw new Exception("please do not divide by zero");
		}
		return a/b;
	}
}
