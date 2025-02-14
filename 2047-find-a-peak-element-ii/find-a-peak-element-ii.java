class Solution {
    public int[] findPeakGrid(int[][] mat) {
        int[] arr= {-1,-1};
        int n = mat.length, m = mat[0].length;
        int low  = 0, high  = m-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            int i = findI(mat,n,mid);
            int left  = -1, right  = -1;
            if(mid!=0) left = mat[i][mid-1];
            if(mid!=m-1) right = mat[i][mid+1]; 
            if(mat[i][mid] > left && mat[i][mid] > right){
                arr[0] = i;
                arr[1] = mid;
                return arr;
            }else if(mat[i][mid] < left) high = mid -1;
            else low = mid +1;
        }

        return arr;
        
    }
    private static int findI(int[][] arr, int n, int j){
        int max = Integer.MIN_VALUE, ind = 0 ;
        for(int i=0;i<n;i++){
            if(arr[i][j] > max){
                max = arr[i][j];
                ind = i;
            }
        }  
        return ind;
    }
}