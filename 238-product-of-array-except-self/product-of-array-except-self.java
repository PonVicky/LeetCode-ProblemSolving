class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        arr1[0] = 1;
        for(int i=1;i<n;i++) arr1[i] = arr1[i-1] * nums[i-1];
        int right =1 ;
        for(int i=n-1;i>=0;i--){
            int temp = nums[i];
            nums[i] = right;
            right = right * temp;
        }
        for(int i=0;i<n;i++) nums[i]*=arr1[i];

        return nums;
    }
}