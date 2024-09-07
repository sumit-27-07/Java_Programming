package accenture;

public class binary_decimal {
	public static void find_dec(int bin) {
		int sum=0;
		for(int i=0;bin>0;i++) {
			int rem=bin%10;
			sum+=(rem*Math.pow(2, i));
			bin/=10;
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
		find_dec(11001);
	}

}
