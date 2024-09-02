package com.linkedlist.implementations;

public class SinglyLinkedList {

	private Node head;
	private Node tail;
	private int size;

	public SinglyLinkedList() {
		this.size = 0;
	}

	private class Node {
		private int value;
		private Node next;

		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

//	public int get(int index) {
//		Node temp = head;
//		for(int i=0;i<index;i++) {
//			if(temp.value == )
//		}
//	}

	public void insertAtIndex(int index, int value) {

	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;

		if (tail == null) {
			tail = head;
		}
		size += 1;
	}

	public void insertLast(int val) {
//		if(tail == null) {
//			insertFirst(val);
//			return;
//		}
//		Node node = new Node(val);
//		tail.next = node;
//		tail = node;
//		size++;

		// another method

		Node temp = head;
		if (head == null) {
			insertFirst(val);
			return;
		}
		while (temp.next != null) {
			temp = temp.next;
		}

		Node node = new Node(val);
		temp.next = node;
//		node = temp;
		size++;

	}

	public void set(int val, int index) {
		if (index == 0) {
			insertFirst(val);
			return;
		}
		if (index == size) {
			insertLast(val);
			return;
		}
		Node temp = head;
		for (int i = 1; i < index; i++) {
			temp = temp.next;
		}
		Node node = new Node(val, temp.next);
		temp.next = node;
//		node = temp.next;
//		node.next = temp.next.next;
//		temp.next = node;
//		node = temp;
//		node.next = temp.next.next;
		size++;
	}

	public int deleteFirst() {
		int value = head.value;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size --;
		return value;
	}

	public int deleteLast() {
		if(head == null) {
			throw new IllegalStateException("List not found");
		}
		Node temp = head;
		for(int i=0;i<size-2;i++){
			temp = temp.next;
		}
		int num=0;
		tail = temp;
		num=temp.next.value;
		temp.next = null;
		size--;
		return num;
		
	}
	
	public Node get(int prevIndex) {
		Node temp = head;
		for(int i=0;i<prevIndex;i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public int delete(int index) {
		if(index == 0) {
			return deleteFirst();
		}
		if(index == size -1) {
			return deleteLast();
		}
		Node prev = get(index-1);
		int val = prev.next.value;
		prev.next = prev.next.next;
		prev.next.value = prev.next.next.value;
		
		return val;
	}
	
	public Node getNode(int value) {
		Node temp = head;
		while(temp != null) {
			if(temp.value == value) {
				return temp;
			}
			temp = temp.next;
		}
		
		return null;
	}

	public void display() {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
}
