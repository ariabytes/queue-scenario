package main;

import queue.*; // for ArrayLisQueue and Queue
import stack.*;
public class Main {

	public static void main(String[] args) {
		
		Queue q = new ArrayListQueue();
		
		System.out.println("Queue FIFO");
		q.enqueue("Añora");
		q.enqueue("Arianne");
		q.enqueue("Danielle");
		
		System.out.println(q.peek());
		
		q.dequeue();
		System.out.println(q.peek());
		
		q.dequeue();
		System.out.println(q.peek());
		
		StackQueue sq = new StackQueue();
		
		System.out.println("\nStack LIFO");

	
		sq.push("Añora");
		sq.push("Arianne");
		sq.push("Danielle");
		
		System.out.println(sq.peak());
		
		sq.pop();
		System.out.println(sq.peak());
		
		sq.pop();
		System.out.println(sq.peak());
		

	}

}
