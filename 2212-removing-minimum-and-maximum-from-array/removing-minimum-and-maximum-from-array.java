class Solution {
    public int minimumDeletions(int[] nums) {
         int min =  0 , max  = 0;
         int n = nums.length;
         for(int i=0;i<n;i++){
            if(nums[i]  > nums[max]) max = i;
            
            if(nums[i] < nums[min])  min  = i;
         }
         if(max < min){
            int temp = min;
            min = max; 
            max = temp;
         }

        //  int leftAndRight  = (n-max) + (min+1);
        //  int left  = n-min;
        //  int right = max+1;

         return Math.min((n-max) + (min+1), Math.min(n-min, max+1)) ;
    }
}