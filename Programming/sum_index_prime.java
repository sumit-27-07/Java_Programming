package accenture;

public class sum_index_prime {

	public static void main(String[] args) {
		int[] arr= {10,-12,2,5,3,15,17,21,-3,-4};
		int sum=0;
		for(int i=2;i<arr.length;i++) {
			int ch=0;
			for(int j=1;j<i;j++) {
				if(i%j==0) {
					ch++;
				}
			}
			if(ch<2) {
				sum+=arr[i];
			}
		}
		System.out.println(sum);
	}

}