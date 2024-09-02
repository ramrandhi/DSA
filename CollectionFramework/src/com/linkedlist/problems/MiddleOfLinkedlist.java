package com.linkedlist.problems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MiddleOfLinkedlist {
	
//	Given a Singly Linked List, the task is to find the middle of the linked list. 
//	If the number of nodes are even, then there would be two middle nodes, so return the second middle node.
	
	public static void main(String[] args) {
		List<Integer> arr = new LinkedList<>(Arrays.asList(11,13,17,14,15));
		System.out.println(arr.size());
		System.out.println(arr.get((arr.size()/2)));
	}
}