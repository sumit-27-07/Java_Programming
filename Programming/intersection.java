package hit;

import java.util.HashSet;

public class intersection {

	public static void main(String[] args) {
		int a1[]= {1,2,3,4,5,6};
		int a2[]= {1,3,6,8,9,4};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<a1.length;i++) {
			hs.add(a1[i]);
		}
		for(int i=0;i<a2.length;i++) {
			if(!hs.contains(a2[i])) {
				System.out.println(a2[i]);
			}
		}
	}

}
