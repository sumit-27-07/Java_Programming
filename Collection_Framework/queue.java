package Collection_Framework;

import java.util.*;

public class queue {

	public static void main(String[] args) {
		Queue<Integer> q=new LinkedList<>();
		q.offer(6);
		q.offer(2);
		q.offer(5);
		System.out.println(q);
		q.poll();
		System.out.println(q);
		System.out.println(q.peek());
	}

}
