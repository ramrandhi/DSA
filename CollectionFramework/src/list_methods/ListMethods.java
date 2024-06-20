package list_methods;

public class ListMethods {
		/*
		  		Lists:
		  		1. list are collections that maintain their elements in order and can contain duplicates
		  		2. the elements in list are order
		  		3. each element are position based, starting from index 0.
		  		
		  		
		  		List methods:
		  		1. E get(int index)
		  		2. E set(int index, E element)
		  		3. void add(int index, E element)
		  		4. boolean addAll(int index, Collection<? extends E> c)
		  		5. E remove(int indexs)
		  		
		  		IMPLEMENTATIONS OF LISTS:
		  		
		  		Three implementations of the list interface are provided in the java.util package:
		  		1. ArrayList
		  		2. LinkedList
		  		3. Vector
		  		
		  		
		  		ARRAYLIST:
	 		
		 		1. Arraylist is a dynamic array
		 		2. to be used when we don't know what is going to be the size of the array.
		 		3. internally it uses notmal array, set to some default capacity
		 		4. when that capacity is reached, it will create a new array of bigger size (50% of its current capacity) and copies
		 			all the elements from the old array to the new array
		 		5. new arrays reference for its internal usage
		 		6. as the old array is no longer in use, it will be garbage collected in the next garbage collection.
		 		
		 		LINKEDLIST : 
		 		
		 		1. the linkedlist internally implements a doubly-linked list.
	 			2. insertions and deletions in a doubly-linked list are very efficient.
	 			
	 			VECTOR:
	 			
	 			1. The vector class is a legacy class which implements the list interface
			 	2. the vector and arraylist classes are implemented using dynamically.(dynamic data addiction)
			 	3. resizable arrays, providing fast random access(i.e., position-based access) and fast.
			 	4. list traversal - very much like using an ordinary array
			 	5. unlike the arrraylist class, the vector class is thread-safe, meaning that concurrent calls of the vector will not
			 		compromise its integrity.
			 	6. the arraylist and vector offer comparable performance, but vectors suffer a slight performance penality due to
			 		synchronization.
			 		
			 		
			 	ARRAYLIST vs LINKEDLIST
			 	
			 	1. Position-based access has constant-time performance for the arraylist and vector classes.
			 	2. Position-based access is in linear time for a Linkedlist owing to traversal in a doubly-linked list.
			 	3. when frequent insertions and deletions occur inside a list, a LinkedList can be worth considering.
			 	4. overall, the arraylist implementation is the best choice for implementating lists.
			 	5. in addition to the list interface, the linkedlist class also implements Deque interface that allow it to be used for
			 		stacks and different kinds of queues.
		 
		 */
}
