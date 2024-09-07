package dsa;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<>();
		s.push(5);
		s.push(6);
		while(!s.isEmpty()) {
			System.out.println(s.peek());
			s.pop();
		}
	}

}
