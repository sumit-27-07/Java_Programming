package accenture;
import java.util.*;
public class sum3 {

	public static void main(String[] args) {
		int[] arr= {-1,0,1,2,-1,-4};
		List<ArrayList<Integer>> res=new ArrayList<>();
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==0) {
						if(hs.contains(arr[i]) && hs.contains(arr[j]) && hs.contains(arr[k])){
							continue;
						}
						else {
							ArrayList<Integer> l=new ArrayList<>();
							l.add(arr[i]);
							l.add(arr[j]);
							l.add(arr[k]);
							res.add(l);
							hs.add(arr[i]);
							hs.add(arr[j]);
							hs.add(arr[k]);
						}
						
					}
				}
			}
		}
		System.out.println(res);
	}

}
