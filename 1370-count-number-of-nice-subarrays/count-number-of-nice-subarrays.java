class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return (returnCount(nums,k) - returnCount(nums,k-1));
    }
    public static int returnCount(int[] arr, int goal){
        if(goal < 0) return 0;
        int r = 0, l = 0, sum  = 0, count =0 ;
        while(r < arr.length){
            sum+=(arr[r] % 2);
            while(sum  > goal){
                sum-=(arr[l]%2);
                l++;
            }
            count+=r-l+1;
            r++;
        }
        return count;
    }
}