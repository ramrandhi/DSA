package com.linkedlist.theroms;

public class FloysCycleDetection {
	public ListNode delectCycle(ListNode head) {
		if (head == null || head.next == null) {
			return null;
		}

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				break;
			}
		}

		if (fast == null || fast.next == null) {
			return null;
		}

		slow = head;

		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}

		return slow;
	}
}

class ListNode {
	int value;
	ListNode next;

	public ListNode(int val) {
		value = val;
		next = null;
	}
}
