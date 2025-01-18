class Solution {
    public int maxSum(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        int maxSum = -1;
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++) maxSum = Math.max(maxSum,traverseSum(grid,i,j));
        }
        return maxSum;
    }
    public static int traverseSum(int[][]arr, int i, int j){        
        return arr[i][j]+arr[i-1][j-1]+arr[i-1][j]+arr[i-1][j+1]+arr[i+1][j-1]+arr[i+1][j]+arr[i+1][j+1];
    }
}