package com.linkedlist.implementations;

public class CircularLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public CircularLinkedList() {
		this.size = 0;
	}

	private class Node {
		private Node next;
		private int value;

		public Node(int value) {
			this.value = value;
		}
	}

	public void insertFirst(int value) {
		Node node = new Node(value);
		if (size == 0) {
			head = node;
			tail = node;
			tail.next = head;
			size ++;
			return;
		}
		node.next = head;
		head = node;
		tail.next = head;
		size ++;
	}

	public void display() {
		Node temp = head;
		if(temp != null) {
			do {
				System.out.print(temp.value + " -> ");
				temp = temp.next;
			} while(temp != head);
			System.out.println("END");
		}
	}
}
