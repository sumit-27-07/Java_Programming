package accenture;
import java.util.*;
public class maximum_barrier {

	public static void main(String[] args) {
		int[][] input= {{2, 3, 2}, {4, 6, 1}, {5, 5, 5}, {10, 10, 2}};
		HashSet<Integer> hs=new HashSet<>();
		for(int i=0;i<input.length;i++) {
			int x=input[i][0],xd=input[i][0]+input[i][2]+1;
			for(int j=x;j<xd;j++) {
				hs.add(j);
			}
		}
		System.out.println(hs.size());
	}

}
