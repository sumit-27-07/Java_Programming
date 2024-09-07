package Collection_Framework;
import java.util.Arrays;
public class array {

	public static void main(String[] args) {
		int[] arr= {5,6,3,8,7,9};
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
		int x=Arrays.binarySearch(arr, 3);
		System.out.println("\nElement "+3+" present in "+x+" Index");
		Arrays.fill(arr, 0);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
