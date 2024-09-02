package com.linkedlist.implementations;

public class DoublyLinkedList {

    private Node head;
    private Node tail;
    private int size;

    public DoublyLinkedList() {
        this.size = 0;
    }

    private class Node {
        private Node next;
        private Node prev;
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
        } else {
            node.next = head;
            head.prev = node;
            head = node;
        }
        size++;
    }

    public void insertLast(int value) {
        Node node = new Node(value);
        if (size == 0) {
            insertFirst(value);
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
            tail.next = null;
        }
        size++;
    }

    public void setAtIndex(int index, int value) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node node = new Node(value);
        if (index == 0) {
            insertFirst(value);
        } else if (index == size - 1) {
            insertLast(value);
        } else {
            Node prevNode = get(index);
            node.prev = prevNode;
            node.next = prevNode.next;
            prevNode.next.prev = node;
            prevNode.next = node;
            size++;
        }
    }

    public Node get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public int deleteFirst() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Cannot delete from an empty list");
        }
        int deletedValue = head.value;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
        return deletedValue;
    }

    public int deleteLast() {
        if (size == 0) {
            throw new IndexOutOfBoundsException("Cannot delete from an empty list");
        }
        int deletedValue = tail.value;
        if (size == 1) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
        return deletedValue;
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
