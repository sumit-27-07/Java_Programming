package accenture;

public class multiply_subarray_sums {

	public static void main(String[] args) {
		int[] arr= {3,8,14,12,10,7,4};
		int sum_in=0,sum_de=0;
		int i=0,n=arr.length;
		while(arr[i]<arr[i+1]) {
			sum_in+=arr[i];
			i++;
		}
		sum_in+=arr[i];
		sum_de+=arr[i];
		i++;
		for(int j=i;j<n;j++) {
			sum_de+=arr[j];
		}
		System.out.println("RESULT:"+(sum_in*sum_de));
	}

}
