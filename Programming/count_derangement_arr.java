package hit;

import java.util.Arrays;

public class count_derangement_arr {
	public static int solve(int n) {
		if (n==1){
			return 0;
		}
		if(n==2) {
			return 1;
		}
		int ans=(n-1)*(solve(n-2)+solve(n-1));
		return ans;
	}
	public static int solvemem(int n,int[] dp) {
		if (n==1){
			return 0;
		}
		if(n==2) {
			return 1;
		}
		if(dp[n]!=-1) {
			return dp[n];
		}
		dp[n]=(n-1)*(solvemem((n-2),dp)+solvemem((n-1),dp));
		return dp[n];
	}
	public static int solvetab(int n) {
		int[] dp=new int[n+1];
		Arrays.fill(dp,-1);
		dp[1]=0;
		dp[2]=1;
		for(int i=3;i<=n;i++) {
			dp[i]=(i-1)*(dp[i-2]+dp[i-1]);
		}
		return dp[n];
	}
	public static void main(String[] args) {
		/*int[] dp=new int[5];
		Arrays.fill(dp,-1);
		int res=solvemem(4,dp);
		System.out.println(res);*/
		
		int res=solvetab(4);
		System.out.println(res);
		
	}

}
