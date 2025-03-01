class Solution {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;
        for(int i=1;i<n;i++){
            if(nums[i-1] == nums[i]){
                nums[i-1] = nums[i]*2;
                nums[i] = 0;
                i++;
            }
        }
        int z  = -1;
        for(int i=0;i<n;i++){
            if(nums[i] == 0){
                z = i; break;
            }
        }
        if(z == -1) return nums;
        for(int i=z;i<n;i++){
            if(nums[i] != 0){
                int temp = nums[i];
                nums[i] = nums[z];
                nums[z] = temp;
                z++;
            }
        }

        return nums;

    }

}