class Solution {
    public void nextPermutation(int[] nums) {
        int pt1 = -1;
        int n = nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]){
                pt1 = i;
                break;
            }
        }
        if(pt1 == -1){
            reverse(0,n-1,nums);
            return;
        }
        for(int i=n-1;i>pt1;i--){
            if(nums[i] > nums[pt1]){
                int temp = nums[i];
                nums[i] = nums[pt1];
                nums[pt1] = temp;
                break;
            }
        }
        reverse(pt1+1,n-1,nums);
    }
    public static void reverse(int i, int j, int[] arr){
        while(i <= j){
            int temp = arr[i];
            arr[i] = arr[j] ;
            arr[j] = temp;
            i++;j--;
        }
    }
}