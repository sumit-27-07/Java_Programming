package accenture;

public class refuel_vehicle {

	public static void main(String[] args) {
		double x=150,n=4,sum=0;
		int[] arr={50, 200, 90, 50};
		for(int i=0;i<arr.length;i++) {
			sum+=arr[i];
		}
		
		if(sum-(n*x)>0) {
			System.out.println(0);
		}
		else {
			double rem=Math.abs(sum-(n*x));
			System.out.println((int)Math.ceil(rem/x));
		}
		
		
	}

}
