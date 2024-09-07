package hit;

import java.util.HashMap;
import java.util.Set;

public class find_elements {

	public static void main(String[] args) {
		int arr[]= {1,2,1,2,3,1,2,3,6};
		int n=arr.length;
		HashMap<Integer,Integer> hs=new HashMap<>();
		for(int i=0;i<n;i++) {
			if(hs.containsKey(arr[i])) {
				hs.put(arr[i], hs.get(arr[i])+1);
			}else {
				hs.put(arr[i],1);
			}
		}
		System.out.println(hs);
		Set<Integer> keys=hs.keySet();
		for(Integer key:keys) {
			int x=hs.get(key);
			if(x>=(n/3)) {
				System.out.println(key+":"+hs.get(key));
			}
		}
	}

}
