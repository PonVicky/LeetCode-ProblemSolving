class Solution {
    public int climbStairs(int n) {
        int[] dp = new int[n+1];
        Arrays.fill(dp,-1);
        return climb(n,dp);
    }
    public static int climb(int n,int[] dp){
        if(n == 1) return 1;
        if(n == 0) return 1;
        if(dp[n] != -1) return dp[n];
        int right = climb(n-1,dp);
        int left  = 0;
        if( n > 1) left = climb(n-2,dp);
        return dp[n] = right+left;
    }
}