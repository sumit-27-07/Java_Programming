package hit;
class Solution {
    public void twoEggDrop(int floors) {
        int eggs = 2;
        int dp[][] = new int[eggs+1][floors+1];
        int c =0;
        
        for(int i=0; i <= floors; i++){
            dp[1][i] = i;
        }
        
        for(int f = 1; f <=floors; f++){
            dp[2][f] = Integer.MAX_VALUE;
                for(int k = 1; k <=f ; k++){
                    c = 1 + Math.max(dp[1][k-1], dp[2][f-k]);
                    if(c < dp[2][f])
                        dp[2][f] = c;
                }
            }
        for(int i=1;i<=eggs;i++) {
        	for(int j=1;j<=floors;j++) {
        		System.out.print(dp[i][j]+" ");
        	}
        	System.out.println();
        }
    }
}
public class egg_problem {

	public static void main(String[] args) {
		Solution s=new Solution();
		s.twoEggDrop(20);

	}

}
