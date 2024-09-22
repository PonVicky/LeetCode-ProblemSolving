class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count  = 0, max = -1;
        for(int n : nums){
            if(n == 1){
                count++;
            }else{
                if(count > max){
                    max = count;
                }
                count  = 0;
            }
        }
        if(count > max){
            max = count;
        }

        return max;
    }
}