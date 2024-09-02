package com.collections.linkedlist;

public class SLLMain {
	public static void main(String[] args) {
		InternalSinglyLinkedList obj = new InternalSinglyLinkedList();
		obj.insertFirst(5);
		obj.insertFirst(10);
		obj.insertFirst(7);
		obj.insertFirst(17);
		obj.insertLast(55);
		obj.display();
		System.out.println();
		
	}
}
