package Collection_Framework;

import java.util.*;

public class Hashmap {

	public static void main(String[] args) {
		Map<Integer,String> mp=new HashMap<>();
		mp.put(1, "one");
		mp.put(2, "two");
		System.out.println(mp);
		mp.put(2, "three");
		mp.putIfAbsent(1, "onee");
		System.out.println(mp);
		System.out.println(mp.containsKey(2));
		System.out.println(mp.containsValue("two"));
		for(Map.Entry<Integer,String> e:mp.entrySet()) {
			System.out.print(e+" ");
			System.out.print(e.getKey()+" ");
			System.out.print(e.getValue()+" ");
		}
		System.out.println();
		for(Integer k:mp.keySet()) {
			System.out.print(k+" ");
		}
		System.out.println();
		for(String k:mp.values()) {
			System.out.print(k+" ");
		}
		
		
		Map<Integer,String> tmp=new TreeMap<>();
		tmp.put(10, "one");
		tmp.put(2, "two");
		System.out.println("\n"+tmp);
		tmp.remove(2);
		System.out.println(tmp);
	}
	
}
