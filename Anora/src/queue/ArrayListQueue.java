package queue;

import java.util.*; //for ArrayList and List

public class ArrayListQueue<E> implements Queue<E>{
	
	private List<E> data = new ArrayList<>();
	
	public void enqueue(E x) {
		data.add(x);	 
	}
	 
	public E dequeue() {
		return data.remove(data.size() - data.size());
	}
		
	public E peek() {
		return data.get(data.size() - data.size());
	}
		
	public boolean isEmpty() {
		return data.size() == 0;
	}
		
	//Method check size
	public int size() {
		return data.size();
	}
	
}
