package datastructure;
import java.util.*;
public class UseQueue {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * 
		 */
		System.out.println("============================================");
		Queue<Integer> Q = new LinkedList<Integer>();
		//add
		Q.add(1);
		Q.add(2);
		Q.add(3);
		Q.add(4);
		Q.add(5);
		Q.add(6);
		Q.add(7);
		Q.add(8);

		System.out.println("Queue is: " + Q);
		System.out.println("Peek: " + Q.peek());
		System.out.println("Remove: " + Q.remove());
		System.out.println("Queue is: " + Q);
		System.out.println("Poll " + Q.poll());
		System.out.println("Poll " + Q.poll());
		System.out.println("Poll " + Q.poll());
	}
}





