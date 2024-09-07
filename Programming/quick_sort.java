package accenture;

public class quick_sort {
	public static void swap(int[] arr, int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	public static int partition(int[] arr,int s,int e) {
		int pivot=arr[s],c=0;
		for(int i=s+1;i<=e;i++) {
			if(arr[i]<pivot) {
				c++;
			}
		}
		int pivotindex=s+c;
		swap(arr,s,pivotindex);
		int i=s,j=e;
		while(i<pivotindex && j>pivotindex) {
			while(i<pivotindex && arr[i]<pivot) {
				i++;
			}
			while(j>pivotindex && arr[j]>pivot) {
				j--;
			}
			if (i < pivotindex && j > pivotindex) { 
	            swap(arr, i, j);
	            i++;
	            j--;
	        }
		}
		return pivotindex;
	}
	public static void quicksort(int[] arr,int s,int e) {
		if(s>=e) {
			return;
		}
		int pivot=partition(arr,s,e);
		quicksort(arr,s,pivot-1);
		quicksort(arr,pivot+1,e);
	}

	public static void main(String[] args) {
		int[] arr= {5,5,85,3,2,1};
		quicksort(arr,0,arr.length-1);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}

	}

}
