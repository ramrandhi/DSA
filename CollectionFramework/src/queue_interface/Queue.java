package queue_interface;

public class Queue {
	
	/*
	 	The queue interface extends the collection interface with the following methods:
	 	1. boolean add(E element) - Illegal state exception when the queue is full so better to use offer method
	 	2. boolean offer(E element) - both are used to add elements to the queue
	 	3. E poll() - poll and remove are used to remove elements.
	 	4. E remove() - if there is no elements to remove it throws exception so better to use poll method
	 	5. E peek() - better to use peek as it does not throw any exception if there is no item in the queue
	 	6. E element - throws exception if there is no item in the queue so better to use peek
	 	7. 
	 */

}
