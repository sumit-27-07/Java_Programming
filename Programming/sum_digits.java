package accenture;

public class sum_digits {

	public static void main(String[] args) {
		int[] arr= {11,14,16,10,9,8,24,5,4,3};
		int sum1=0,sum2=0;
		for(int i=0;i<arr.length;i++) {
			sum2+=arr[i];
			int sum=0;
			while(arr[i]>0) {
				sum+=arr[i]%10;
				arr[i]=arr[i]/10;
			}
			arr[i]=sum;
			sum1+=sum;
		}
		sum1%=10;
		sum2%=10;
		System.out.println(sum1-sum2);
	}

}
