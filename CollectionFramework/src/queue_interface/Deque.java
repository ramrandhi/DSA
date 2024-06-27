package queue_interface;

public class Deque {
	
	/*
	 	1. The Deque interface extends the Queue interface to allow double-ended queues.
	 	2. it allows operations not just at its head, but also its tail.
	 	3. Element can be used inserted or removed at either ends.
	 	4. A deque can be used as FIFO queue, where elements added at the tail are presented at the head for inspection or removal in
	 		the same order, thus implementation FIFO order.
	 		
	 	ADDING ELEMENTS:
	 	1. booolean offerFirst(E element)
	 	2. boolean offerLast(E element) Queue equivalent: offer()
	 	3. void push(E element) Synonym: addFirst()
	 	4. void addFirst(E element)
	 	5. void addLast(E element) Queue equivalent: add()
	 	
	 	REMOVING ELEMENTS:
	 	1. E pollFIrst() Queue equivalent: poll()
	 	2. E pollLast()
	 	3. E pop() Synonym: removeFirst()
	 	4. E removeFirst() Queue equivalent: remove()
	 	5. E removeLast()
	 	
	 	
	 	*** -> For FIFO (queue) operations, both ArrayDeque and LinkedList are suitable as they both implement the Deque interface. 
	 		However, ArrayDeque is often preferred due to its better performance and lower memory overhead compared to LinkedList.
		->  For LIFO (stack) operations, both ArrayDeque and LinkedList can be used. ArrayDeque is typically preferred because of 
			its efficient performance for stack operations.  
	 */

}
