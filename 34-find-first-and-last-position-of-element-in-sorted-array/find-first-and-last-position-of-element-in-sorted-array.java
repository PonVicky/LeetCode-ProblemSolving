class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = lowerBound(target,nums);
        if(first == nums.length || nums[first] != target) return new int[] {-1,-1};
        return new int[] {first,upperBound(target,nums)-1};
    }
    public static int upperBound(int target, int[] arr){
        int found  = arr.length;
        int low  = 0, high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] > target){
                found = mid;
                high = mid -1;
            }else{
                low = mid +1;
            }
        }
        return found;
    }
    public static int lowerBound(int target, int[] arr){
        int found  = arr.length;
        int low  = 0 , high = arr.length-1;
        while(low <= high){
            int mid = (low + high)/2;
            if(arr[mid] >= target){
                found  = mid;
                high = mid -1;
            }else low = mid +1;
        }
        return found;
    }

}