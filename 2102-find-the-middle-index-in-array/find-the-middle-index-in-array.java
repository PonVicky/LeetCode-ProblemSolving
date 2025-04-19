class Solution {
    public int findMiddleIndex(int[] nums) {
        int preFix =0;
        for(int i:nums) preFix+=i;
        int sufFix = 0;
        for(int i=0;i<nums.length;i++){
            sufFix+=nums[i];
            if(preFix == sufFix) return i;
            preFix-=nums[i];
        }
        return -1;
    }
}