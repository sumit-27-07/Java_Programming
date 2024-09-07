package accenture;

import java.util.*;

public class knumber_not_divisble {

	public static void main(String[] args) {
		int k=4,i=2;
		List<Integer> res=new ArrayList<>();
		res.add(1);
		k--;
		int[] arr= {2,3,4,5,6};
		while(k>0) {
			for(int j=0;j<arr.length;j++) {
				if(i%arr[j]==0) {
					break;
				}
				if(j==arr.length-1 && i%arr[j]!=0) {
					res.add(i);
					k--;
				}
			}
			i++;
			
		}
		System.out.println(res);
	}

}
