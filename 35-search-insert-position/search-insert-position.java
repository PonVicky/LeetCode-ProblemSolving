class Solution {
    public int searchInsert(int[] nums, int target) {
    int n = nums.length;
    return getInsert(0,n-1,nums,target,n);
    }
    public static int getInsert(int low, int high, int[] arr, int x, int ans){
        if(low > high) return ans;
        int mid = low + (high -low)/2;
        if(arr[mid] >= x) return getInsert(low,mid-1,arr,x,mid);
        else return getInsert(mid +1, high,arr,x,ans);
    }
}