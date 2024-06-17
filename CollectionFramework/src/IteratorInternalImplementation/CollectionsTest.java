package IteratorInternalImplementation;

import java.util.Iterator;

public class CollectionsTest {
	
	public static void main(String[] args) {
		OurGenericArray<Integer> items = new OurGenericArray<>();
		items.add(1);
		items.add(2);
		items.add(3);
		
		for(int x : items) {
			System.out.println(x);
		}
		
//		Iterator<Integer> iterator = items.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
	}
}
