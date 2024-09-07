package accenture;

public class sum_prime {

	public static void main(String[] args) {
		int N=10,f,sum=0;
		for(int i=2;i<=N;i++) {
			f=0;
			for(int j=2;j<=Math.sqrt(i);j++) {
				if(i%j==0) {
					f=1;
					break;
				}
			}
			if(f==0) {
				sum+=i;
				System.out.println(i);
			}
		}
		System.out.println("Sum:"+sum);

	}

}
