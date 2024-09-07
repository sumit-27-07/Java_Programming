package dsa;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class hashset {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<>();
		set.add(5);
		set.add(6);
		set.add(9);
		Iterator<Integer> it=set.iterator();
		System.out.println(set);
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		if(set.contains(5)) {
			System.out.println("5 present");
		}
		set.remove(5);
		if(!set.contains(5)) {
			System.out.println("5 not present");
		}
		
		//HashMap
		HashMap<Integer,String> map=new HashMap<>();
		map.put(59, "sumit");
		map.put(61,"Fauze");
		System.out.println(map);
		System.out.println(map.containsKey(59));
		System.out.println(map.containsValue("sumit"));
		System.out.println(map.get(59));
		System.out.println(map.size());
		for( Map.Entry<Integer, String> e : map.entrySet()) {
			System.out.print(e.getKey()+":");
			System.out.println(e.getValue());
		}

		Set<Integer> keys=map.keySet();
		for(Integer key:keys) {
			System.out.println(key+":"+map.get(key));
		}
		
		map.remove(61);
		System.out.println(map);

	}

}
