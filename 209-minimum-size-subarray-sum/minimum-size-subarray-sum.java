class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;
        int l = 0, r = 0;
        int sum  = nums[0];
        int n = nums.length;
        while(r < n){
             if(sum >= target){
                if(r - l + 1 < min) min = r-l+1;
            }
            if(sum > target && l < r){
                sum-=nums[l];
                l++;
                continue;
            }
            if(sum >= target){
                if(r - l + 1 < min) min = r-l+1;
            }

            r++;
            if(r < n) sum+=nums[r];
        }

        if(min == Integer.MAX_VALUE) return 0;

        return min;
    }
}