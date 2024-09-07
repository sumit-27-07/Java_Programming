package Collection_Framework;

import java.util.Stack;

public class stack {

	public static void main(String[] args) {
		Stack<String> s=new Stack<>();
		s.push("Dog");
		s.push("Cow");
		System.out.println(s);
		System.out.println(s.peek());
		s.pop();
		System.out.println(s);
	}

}
