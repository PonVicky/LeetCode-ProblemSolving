class Solution {
    public int findMin(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums[0];
        int low = 0 , high = n-1;
        int min = Integer.MAX_VALUE;
        while(low <= high){
            int mid = low +(high - low)/2;

            if(nums[low] == nums[mid] && nums[high] == nums[mid]){
                min = Math.min(min,nums[low]);
                low++;high--;
                continue;
            }

            if(nums[low] <= nums[mid]){
                min = Math.min(min,nums[low]);
                low = mid +1;
            }else if(nums[mid] <= nums[high]){
                min = Math.min(min,nums[mid]);
                high = mid -1;
            }
        }

        return min;
    }
}