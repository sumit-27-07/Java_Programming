package accenture;

public class fine_number {

	public static void main(String[] args) {
		int[] arr1= {1,2,3,4,5};
		int[] arr2= {10,12,34,2,4,89};
		int max1=arr1[0],max2=arr2[0];
		int min1=arr1[0],min2=arr2[0];
		for(int i=1;i<arr1.length;i++) {
			if(max1<arr1[i]) {
				max1=arr1[i];
			}
			if(min1>arr1[i]) {
				min1=arr1[i];
			}
		}
		for(int i=1;i<arr2.length;i++) {
			if(max2<arr2[i]) {
				max2=arr2[i];
			}
			if(min2>arr2[i]) {
				min2=arr2[i];
			}
		}
		int max=max2,min=min2;
		if(max1>max) {
			max=max1;
		}
		if(min>min1) {
			min=min1;
		}
		System.out.println("Fine Number:"+(max-min));

	}

}
