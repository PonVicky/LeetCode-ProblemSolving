class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
    int[] dp = new int[n+1]; Arrays.fill(dp,-1);
    return robThem(n-1,nums,dp);
    }
    public static int robThem(int n,int[] arr, int[] dp){
        if(n == 0 )return arr[0];
        if(n < 0) return 0;
        if(dp[n] != -1) return dp[n];
        int pick = arr[n] + robThem(n-2,arr,dp);
        int notPick = robThem(n-1,arr,dp);
        return dp[n] = Math.max(pick,notPick);
    }
    
}