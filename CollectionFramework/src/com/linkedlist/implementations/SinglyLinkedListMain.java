package com.linkedlist.implementations;

public class SinglyLinkedListMain {
	public static void main(String[] args) {
		SinglyLinkedList ll = new SinglyLinkedList();
		ll.insertFirst(24);
		ll.insertFirst(36);
		ll.insertLast(25);
		ll.insertLast(5);
		ll.insertLast(2);
		ll.set(1,2);
		ll.display();
		System.out.println(ll.deleteFirst());
		ll.display();
		System.out.println(ll.deleteLast());
		ll.display();
		System.out.println(ll.delete(1));
		System.out.println(ll.getNode(24));;
		ll.display();
	}
}
 