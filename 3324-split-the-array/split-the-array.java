class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        int[] hash = new int[101];
        for(int i=0;i<nums.length;i++){
            if(hash[nums[i]] == 2) return false;
            hash[nums[i]]++;
        }

        return true;
    }
}