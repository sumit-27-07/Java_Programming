package Collection_Framework;

import java.util.*;

public class arraylist {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(5);
		l.add(9);
		System.out.println(l);
		l.add(0, 8);
		System.out.println(l);
		
		List<Integer> l2=new ArrayList<>();
		l2.add(50);
		l2.add(90);
		
		l.addAll(l2);
		System.out.println(l);
		
		System.out.println(l.get(2));
		
		l.remove(2);
		System.out.println(l);
		l.remove(Integer.valueOf(50));
		System.out.println(l);
		
		l.set(0,301);
		System.out.println(l);
		
		System.out.println(l.contains(301));
		
		for(Integer i:l) {
			System.out.print(i+" ");
		}
		System.out.println();
		
		Iterator<Integer> it=l.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		
		l.clear();
		System.out.println("\n"+l);
	}

}
