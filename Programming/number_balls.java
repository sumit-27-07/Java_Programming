package accenture;

public class number_balls {

	public static void main(String[] args) {
		int[] arr= {1,2,7,11,20};
		int res=0;
		for(int i=0;i<arr.length;i++) {
			int x=(int)Math.pow(i+1, 2);
			res+=(x-arr[i]);
		}
		System.out.println(res);
	}

}
