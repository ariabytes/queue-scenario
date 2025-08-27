package stack;

import java.util.*; //for ArrayList and List

public class StackQueue<E> implements StackInterface<E> {
	
	private List<E> data = new ArrayList<>();
	
	public void push(E x) {
		data.add(x);	 
	}
	 
	public E pop() {
		return data.remove(data.size() - 1);
	}
		
	public E peak() {
		return data.get(data.size() - 1);
	}
		
	public boolean isEmpty() {
		return data.size() == 0;
	}
		
	//Method check size
	public int size() {
		return data.size();
	}
	

	
}
