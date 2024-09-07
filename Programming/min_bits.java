package accenture;

public class min_bits {

	public static void main(String[] args) {
		int n=13;
		int count1=0;
		//StringBuilder str=new StringBuilder();
		while(n>0) {
			int bit=n%2;
			if(bit==1) {
				count1++;
			}
			//str.insert(0,String.valueOf(bit));
			n/=2;
		}
		 
		/*
		 * for(int i=0;i<str.length();i++) { if(str.charAt(i)=='1') { count1++; } }
		 */
		double sum=0;
		for(double i=0;i<count1;i++) {
			sum=sum+Math.pow(2, i);
		}
		System.out.println((int)sum);
	}

}
