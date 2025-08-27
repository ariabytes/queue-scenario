package queue;

public interface Queue<E> {	//generic E or general datatype
	// Methods
	void enqueue(E x);
	
	E dequeue();
	
	E peek();
	
	boolean isEmpty();
	
	//Method check size
	int size();

}
