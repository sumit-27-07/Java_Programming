package dsa;

import java.util.LinkedList;

public class predifined_linkedlist {

	public static void main(String[] args) {
		LinkedList<Integer> l1=new LinkedList<Integer>();
		l1.add(5);
		l1.add(0, 6);
		l1.addLast(9);
		System.out.println(l1);
	}

}
