package pq;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityDemo {
	public static void main(String[] args) {
		Queue<String> pq = new PriorityQueue<>();
		
		//as the size grows the insertion order is not maintained
		pq.offer("Apple");
		pq.offer("ball");
		pq.offer("cat");
		pq.offer("dog");
		pq.offer("fc");
		pq.offer("gc");
		pq.offer("high");
		pq.offer("J");
		pq.offer("k");

		for (String s : pq) {
			System.out.println(s);
		}
		System.out.println();
		
		//elements are removed in aplh order 
		//lower alph taking highest priority
		while (!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
		
		

	}
}
