package accenture;
import java.util.*;
public class least_pair {
	public static int findpair(int[] arr,int sum) {
		Arrays.sort(arr);
		return arr[0]*arr[1];
	}
	public static void main(String[] args) {
		int[] arr= {5,2,4,3,9,7,1};
		int sum=9;
		System.out.println(findpair(arr,sum));
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if(arr[i]<arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
