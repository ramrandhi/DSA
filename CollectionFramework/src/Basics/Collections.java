package Basics;

public class Collections {
	
	/*
	 	COLLECTIONS:
	 	1. A collection allows a group of objects to be treated as a single unit
	 	2. the java collections framework provides a set of standard utility classes for managing various kinds of collections
	 	3. the core framework is provided in java.util package and comprises three main parts
	 	 -> the core interfaces
	 	 -> a set of implementations (concrete classes) that are specific implementations of core interfaces
	 	 -> static utility methods found in the collections and arrays classes that can be used to perform various operations on
	 	 	collections and arrays, such as sorting and searching or creating customized collections
	 	 	
	 	 	
	 	 => core interfaces:
	 	 	the collection interfaces extends the iterable interface that specifies an iterator to sequentially access the elements of
	 	 	an iterable object
	 	 	
	 	 	
	 	 										java.lang.Iterables<E>
														|
														|-- collections
														    |
														    |-- List<E>
														    |
				(all these are interfaces)					|-- Queue<E> -- Deque<E>
														    |
														    |-- Set<E> -- SortedSet<E> -- NavigableSet<E>
														    |
														    |-- Map<K,V> -- SortedMap<K,V> -- NavigableMap<K,V>
														    
														    
						
						
						
			=> Implementations(interfaces and its concrete classes)
										java.lang.Iterables<E>
												|
												|-- collections
												    |
												    |-- List<E>
												    |   |-- ArrayList<E>
												    |   |-- LinkedList<E>
												    |   |-- Vector<E>
												    |       |-- Stack<E>
												    |
												    |-- Queue<E>
												    |   |-- LinkedList<E>
												    |   |-- PriorityQueue<E>
												    |   |-- ArrayDeque<E>
												    |
												    |-- Deque<E> (extends Queue<E>)
												    |   |-- LinkedList<E>
												    |   |-- ArrayDeque<E>
												    |
												    |-- Set<E>
												    |   |-- HashSet<E>
												    |   |-- LinkedHashSet<E>
												    |   |-- EnumSet<E>
												    |   |-- CopyOnWriteArraySet<E>
												    |
												    |-- SortedSet<E> (extends Set<E>)
												    |   |-- TreeSet<E>
												    |
												    |-- NavigableSet<E> (extends SortedSet<E>)
												    |   |-- TreeSet<E>
												    |
												    |-- Map<K,V>
												    |   |-- HashMap<K,V>
												    |   |-- LinkedHashMap<K,V>
												    |   |-- Hashtable<K,V>
												    |       |-- Properties
												    |   |-- WeakHashMap<K,V>
												    |   |-- IdentityHashMap<K,V>
												    |   |-- ConcurrentHashMap<K,V>
												    |   |-- ConcurrentSkipListMap<K,V>
												    |
												    |-- SortedMap<K,V> (extends Map<K,V>)
												    |   |-- TreeMap<K,V>
												    |
												    |-- NavigableMap<K,V> (extends SortedMap<K,V>)
												        |-- TreeMap<K,V>


	 */

}
