package accenture;

public class second_largest {
	public static int sec_lar(int[] arr,int index) {
		int sec_max=Integer.MIN_VALUE,max=arr[index];
		for(int i=index+2;i<arr.length;i=i+2) {
			if(max<arr[i]) {
				sec_max=max;
				max=arr[i];
			}
			 else if (arr[i] > sec_max && arr[i] != max) {
	            sec_max = arr[i];
	        }
		}
		if(sec_max==Integer.MIN_VALUE) {
			return max;
		}
		return sec_max;
	}
	public static int sec_min(int[] arr,int index) {
		int sec_min=Integer.MAX_VALUE,min=arr[index];
		for(int i=index+2;i<arr.length;i=i+2) {
			if(min>arr[i]) {
				sec_min=min;
				min=arr[i];
			}
			else if (arr[i] < sec_min && arr[i] != min) {
	            sec_min = arr[i];
	        }
		}
		if(sec_min==Integer.MAX_VALUE) {
			return min;
		}
		return sec_min;
	}
	public static void main(String[] args) {
		int[] arr= {9,1,3,4,8,5,7,2};
		int large=sec_lar(arr,0);
		System.out.println(large);
		int small=sec_min(arr,1);
		System.out.println(small);
	}

}
