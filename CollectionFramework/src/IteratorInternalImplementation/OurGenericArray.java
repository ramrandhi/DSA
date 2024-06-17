package IteratorInternalImplementation;

import java.util.Iterator;

public class OurGenericArray<T> implements Iterable<T>{
	private T[] items;
	private int size;
	
	public OurGenericArray() {
		size=0;
		items = (T[]) new Object[3];
	}
	
	public void add(T item) {
		items[size++] = item;
	}

	@Override
	public Iterator<T> iterator() {
		return new OurGenericClassIterator(this);
	}
	
	private class OurGenericClassIterator implements Iterator<T> {
		
		private OurGenericArray<T> list;
		private int index = 0;
		
		public OurGenericClassIterator(OurGenericArray<T> list) {
			this.list = list;
		}

		@Override
		public boolean hasNext() {
			return index < list.size;
		}

		@Override
		public T next() {
			return list.items[index++];
		}
		
	}
}
