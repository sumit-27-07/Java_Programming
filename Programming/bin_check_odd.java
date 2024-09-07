package accenture;

public class bin_check_odd {

	public static void main(String[] args) {
		int N=5,sum,count=0;
		for(int i=1;i<=N;i++) {
			int n=i;
			sum=0;
			while(n>0) {
				int c=n%2;
				if(c==0) {
					sum+=1;
				}
				else {
					sum+=2;
				}
				n/=2;
			}
			if(sum%2==1) {
				System.out.println(i);
				count++;
			}
		}
		System.out.println("count:"+count);

	}

}
