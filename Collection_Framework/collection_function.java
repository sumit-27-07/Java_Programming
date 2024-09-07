package Collection_Framework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class collection_function {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>();
		l.add(5);
		l.add(9);
		l.add(6);
		l.add(52);
		l.add(32);
		Collections.sort(l);
		System.out.println(l);
		System.out.println(Collections.max(l));
		System.out.println(Collections.frequency(l,9));
		Collections.sort(l,Comparator.reverseOrder());
		System.out.println(l);
	}

}
