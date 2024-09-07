package accenture;

import java.util.Arrays;

public class height_check {

	public static void main(String[] args) {
		int[] heights= {5,2,3,7,4};
		int[] arr=new int[heights.length];
        arr=heights;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println(arr);
        int c=0;
        for(int i=0;i<heights.length;i++){
            if(arr[i]!=heights[i]){
                c++;
            }
        }
        System.out.println(c);

	}

}
