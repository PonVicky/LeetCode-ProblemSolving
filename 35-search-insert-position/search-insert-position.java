class Solution {
    public int searchInsert(int[] nums, int target) {
    int n = nums.length;
    int insert = n;
    int low = 0, high = n-1;
    while(low <= high){
        int mid = (low + high)/2;
        if(nums[mid] >= target){
            insert = mid;
            high = mid -1;
        }else low = mid +1;
    }
    return insert;
    }
}