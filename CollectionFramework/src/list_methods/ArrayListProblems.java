package list_methods;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class ArrayListProblems {

	public static void main(String[] args) {
		List<Integer> alist = new ArrayList<>();
		//always good to use List that is interface on left and add ArrayList on left side best practice
		alist.add(1);
		alist.add(2);
		alist.add(3);
		System.out.println(alist);  
		// ArrayList which is a collection inside it has abstraCollection package inside java.util that internally implements toString  
		alist.set(2, 300);
		
		List<Integer> alist2 = new ArrayList<>();
		alist2.add(4);
		alist2.add(5);
		alist2.add(6);
		
		
		
		//Since arraylist is part of collection framework we can put any other objects that is derived from collection framework which
		// supports adding as it is constructor of arraylist
//		alist2.set(0, 2);
		alist.addAll(alist);
		List<Integer> alist3 = alist.subList(1, 4); // returns values from index 1,2,3 and 4th is excluded
		alist3.set(0,3);
		System.out.println(alist3);
		System.out.println(alist);
//	*****//if we use sublist when we change some value inside in alist3 it will directly effect the reference the alist main object
		// as sublist takes the direct reference from the alist object
		
//		alist3.add
		
//		System.out.println("alist "+alist);
//		System.out.println("index of 2 here "+alist.indexOf(2));
//		System.out.println(alist2);

	}

}
