class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] arr = new int[n];
        int l =0, r = n-1;
        int val = 0;
        for(int i=n-1;i>=0;i--){
            if(Math.abs(nums[l]) > Math.abs(nums[r])){
                val = nums[l];
                l++;
            }else{
                val = nums[r];
                r--;
            }
            arr[i] = val*val;
        }
        return arr;
    }
}