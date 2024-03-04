package com.problem.solving.basicproblems;

import java.util.Arrays;

public class VariableArguments {

	public static void main(String[] args) {
		fun(2,4,3,5,6,7,8,9,5,25,10,26);

	}
	
	static void fun(int...v){
		System.out.println(Arrays.toString(v));
	}

}
