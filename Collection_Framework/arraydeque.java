package Collection_Framework;

import java.util.ArrayDeque;

public class arraydeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> adq=new ArrayDeque<>();
		adq.offer(9);
		adq.offerFirst(42);
		adq.offerLast(2);
		System.out.println(adq);
		
		System.out.println(adq.peekLast());
		
		adq.pollLast();
		System.out.println(adq);

	}

}
