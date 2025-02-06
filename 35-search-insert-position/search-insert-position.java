class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        int low = 0, high = n-1;
        int out = n;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= target){
                out = mid;
                high = mid -1;
            }else low = mid +1;
        }

        return out;
    }
}