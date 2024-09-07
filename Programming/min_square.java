package accenture;

import java.util.Arrays;

public class min_square {
	public static int calcmin(int[] dp,int n) {
		if(n==0) {
			return 0;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		int ans=n;
		for(int i=1;i*i<=n;i++) {
			int temp=i*i;
			ans=Math.min(ans,1+calcmin(dp,n-temp));
		}
		dp[n]=ans;
		return dp[n];
	}
	public static void main(String[] args) {
		int n=12;
		int[] dp =new int[n+1];
		Arrays.fill(dp, -1);
		System.out.println(calcmin(dp,n));
	}

}
