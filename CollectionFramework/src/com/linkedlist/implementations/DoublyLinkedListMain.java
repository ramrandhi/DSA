package com.linkedlist.implementations;

public class DoublyLinkedListMain {
	public static void main(String[] args) {
		DoublyLinkedList dl = new DoublyLinkedList();
		dl.insertFirst(4);
		dl.insertFirst(8);
		dl.insertFirst(5);
		dl.insertLast(6);
		dl.setAtIndex(1, 22);
		dl.display();
		System.out.println(dl.deleteFirst());
		dl.display();
		System.out.println(dl.deleteLast());
		dl.display();
	}

}
