package stack;

public interface StackInterface<E> {
	
	void push (E x);
	
	E pop ();
	
	E peak(); // view from the top
	
	boolean isEmpty();
	
	int size();

	
}
