package accenture;

import java.util.ArrayList;

public class merge_interval {

	public static void main(String[] args) {
		int[][] arr= {{1,3},{2,6},{8,10},{15,18}};
		ArrayList<ArrayList<Integer>> res=new ArrayList<>();
		ArrayList<Integer> s1=new ArrayList<>();
		if(arr.length==0) {
			System.out.println(new ArrayList<>());
		}
		s1.add(arr[0][0]);
		s1.add(arr[0][1]);
		res.add(s1);
		int j=0;
		for(int i=1;i<arr.length;i++) {
			if(res.get(j).get(1)>arr[i][0] && res.get(j).get(1)<arr[i][1]) {
				ArrayList<Integer> sa=new ArrayList<>();
				sa.add(res.get(j).get(0));
				sa.add(arr[i][1]);
				res.set(j, sa);
			}
			else {
				ArrayList<Integer> sa=new ArrayList<>();
				sa.add(arr[i][0]);
				sa.add(arr[i][1]);
				res.add(sa);
				j++;
			}
		}
		System.out.println(res);
	}

}
