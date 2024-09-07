package Collection_Framework;

import java.util.*;

public class hashset {

	public static void main(String[] args) {
		Set<Integer> s=new HashSet<>();
		s.add(9);
		s.add(3);
		s.add(7);
		s.add(7);
		System.out.println(s);
		s.remove(3);
		System.out.println(s);
		System.out.println(s.contains(7));
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		s.clear();
		System.out.println(s);
		
		Set<Integer> ls=new LinkedHashSet<>(); //Element insert in sequence
		ls.add(9);
		ls.add(3);
		ls.add(7);
		ls.add(7);
		System.out.println(ls);
		ls.remove(3);
		System.out.println(ls);
		System.out.println(ls.contains(7));
		System.out.println(ls.isEmpty());
		System.out.println(ls.size());
		ls.clear();
		System.out.println(ls);
		
		Set<Integer> ts=new TreeSet<>(); //Element insert in sorting
		ts.add(91);
		ts.add(38);
		ts.add(76);
		ts.add(76);
		System.out.println(ts);
		ts.remove(38);
		System.out.println(ts);
		System.out.println(ts.contains(76));
		System.out.println(ts.isEmpty());
		System.out.println(ts.size());
		ts.clear();
		System.out.println(ts);
	}

}
