package list_methods;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListProblems {
	public static void main(String[] args) {
	
		List<Integer> alist = new ArrayList<>();
		alist.add(1);
		alist.add(2);
		alist.add(3);
		
		List<Integer> llist = new LinkedList<>(alist);
		System.out.println(llist);

	}
}
