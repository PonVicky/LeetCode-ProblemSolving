class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        int min = Integer.MAX_VALUE;
        int low = 0, high = n-1;
        while(low <= high){
            int mid = low +(high - low)/2;
            if(nums[low] <= nums[high]){
                min = Math.min(min,nums[low]);
                break;
            }

            if(nums[low] <= nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid +1;
            }else if(nums[mid] <= nums[high]){
                min = Math.min(min,nums[mid]);
                high = mid-1;
            }
        }


        return min;
    }
}