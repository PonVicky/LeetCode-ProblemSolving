class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int repeated = -1;
        int n = grid.length,len = n*n;
        int[] arr = new int[len+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(arr[grid[i][j]] != 0) repeated = grid[i][j];
                arr[grid[i][j]] = 1;
            }
        }
        int sum1 = len * (len+1)/2;
        int sum2 = 0;
        for(int i=0;i<=len;i++){
            if(arr[i] == 1) sum2+=i;
        }

        return new int[] {repeated, sum1-sum2};
    }
}