package accenture;

public class stock_decrease {

	public static void main(String[] args) {
		int[] arr= {5,6,4,5,2,3,4};
		int c=0;
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				c++;
			}
		}
		System.out.println(c);

	}

}
