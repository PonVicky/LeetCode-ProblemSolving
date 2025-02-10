class Solution {
    public int[] sortArrayByParityII(int[] nums) {
     int n = nums.length;
     int odd = 1, even = 0;
     while(odd < n && even < n){
        if(nums[even]%2==1){
            int temp = nums[even];
            nums[even] = nums[odd];
            nums[odd] = temp;
            odd+=2;
        }else even+=2;
     }   
     return nums;
    }
}