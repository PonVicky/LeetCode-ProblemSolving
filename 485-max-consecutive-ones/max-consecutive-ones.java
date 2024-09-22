class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count  = 0, max = -1;
        for(int n : nums){
            if(n == 1){
                count++;
            }else{
               max  = Math.max(count,max);
                count  = 0;
            }
        }
        max = Math.max(count,max);

        return max;
    }
}