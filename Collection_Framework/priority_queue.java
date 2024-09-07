package Collection_Framework;
import java.util.*;
public class priority_queue {

	public static void main(String[] args) {
		PriorityQueue<Integer> pq=new PriorityQueue<>();
		pq.offer(5);
		pq.offer(1);
		pq.offer(2);
		System.out.println(pq);
		pq.poll();
		System.out.println(pq);
		
		PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());
		pq2.offer(1);
		pq2.offer(5);
		pq2.offer(2);
		System.out.println(pq2);
		

	}

}
