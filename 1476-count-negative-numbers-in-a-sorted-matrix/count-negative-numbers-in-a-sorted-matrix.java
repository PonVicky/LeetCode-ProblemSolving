class Solution {
    public int countNegatives(int[][] grid) {
        int totalNegative  = 0;
        int m = grid[0].length;
        for(int i=0;i<grid.length;i++){
            totalNegative+=binarySearch(grid[i],m);
        }

        return totalNegative;
    }
    public static int binarySearch(int[] arr,int n){
        int low = 0, high = n-1;
        int i  = n;
        while(low <= high){
            int mid  = low  +(high - low)/2;
            if(arr[mid] < 0){
                i = mid;
                high = mid -1;
            }else low = mid +1;
        }
        return n-i;
    }
}