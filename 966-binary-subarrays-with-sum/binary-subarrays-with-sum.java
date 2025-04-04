class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
        return subarraySum(nums,goal) - subarraySum(nums,goal-1);
    }
    public static int subarraySum(int[] arr, int goal){
        if(goal < 0) return 0;
        int l = 0 , r  = 0;
        int sum  =0;
        int subarray = 0;
        while(r < arr.length){
            sum+=arr[r];
            while(sum > goal){
                sum-=arr[l];
                l++;
            }
            subarray+= (r-l+1);
            r++;
        }
        return subarray;
    }
}