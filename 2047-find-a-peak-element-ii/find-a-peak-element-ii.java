class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int n = mat.length, m = mat[0].length;
        int low  = 0, high = m-1;
        while(low <= high){
            int col = (low + high)/2;
            int row = findRow(mat,n,col);
            int left = col > 0 ? mat[row][col-1] : -1,  right = col < m-1 ? mat[row][col+1] : -1;
            if(mat[row][col] > left && mat[row][col] > right){
                return new int[]{row,col};
            }
            if(mat[row][col] < left){
                high= col -1;
            }else if(mat[row][col] < right){
                low = col +1;
            }

        }
        return new int[] {-1,-1};
    }
    public static int findRow(int[][] arr, int n , int col){
        int max =  -1;
        int index  = -1;
        for(int i=0;i<n;i++){
            if(arr[i][col] > max){
                max = arr[i][col];
                index = i;
            }
        }
        return index;
    }
}