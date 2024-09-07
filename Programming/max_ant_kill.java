package accenture;

import java.util.*;

public class max_ant_kill {
	 public static int killAnthill(List<Integer> A, int t) {
	        int n = A.size();
	        
	        
	        int[] dp = new int[t + 1];
	        
	        for (int i = 0; i < n; i++) {
	            int time = i + 1;
	            int antsCount = A.get(i);
	            
	            for (int j = t; j >= time; j--) {
	                dp[j] = Math.max(dp[j], dp[j - time] + antsCount);
	            }
	        }
	        
	        return dp[t];
	    }

	public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
        System.out.println("enter size:");
        int n = scanner.nextInt();
        List<Integer> ants = new ArrayList<>();

        System.out.println("enter number:");
        for (int i = 0; i < n; i++) {
            ants.add(scanner.nextInt());
        }

        System.out.println("enter time:");
        int t = scanner.nextInt();
        
        System.out.println(killAnthill(ants, t));
        
        scanner.close();

	}

}
