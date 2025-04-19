class Solution {
    public int pivotIndex(int[] nums) {
        int sum1 = 0, sum2 = 0;
        for(int i:nums) sum1+=i;
        for(int i=0;i<nums.length;i++){
            sum1-=nums[i];
            if(sum1 == sum2) return i;
            sum2+=nums[i];
        }
        return -1;
    }
}