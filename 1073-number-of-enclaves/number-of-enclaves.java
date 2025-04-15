class Solution {
    public static boolean[][] visited;
    public int numEnclaves(int[][] grid) {
        int n = grid.length, m = grid[0].length;
        visited = new boolean[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((i==0||j==0||i==n-1||j==m-1 ) && grid[i][j] == 1) dfs(i,j,grid);
            }
        }
        int[] count  = {0};
        for(int i=1;i<n-1;i++){
            for(int j=1;j<m-1;j++){
                if(grid[i][j] == 1){
                    dfs(i,j,grid,count);
                }
            }
        }

        return count[0];
    }

    public static void dfs(int row, int col, int[][] arr, int[] count){
         if(row < 0 || row >= arr.length || col < 0 || col >= arr[0].length 
        || arr[row][col] == 0 || visited[row][col]){
            return;
        }
        visited[row][col] = true;
        if(arr[row][col] == 1 && !(row==0 || col == 0 || row == arr.length-1 || col == arr[0].length-1)){
            count[0]++;
        }
        arr[row][col] =  0;

        dfs(row+1,col,arr,count);
        dfs(row,col+1,arr,count);
        dfs(row-1,col,arr,count);
        dfs(row,col-1,arr,count);

        visited[row][col] = false;
    }

    public static void dfs(int row, int col, int[][] arr){
        if(row < 0 || row >= arr.length || col < 0 || col >= arr[0].length 
        || arr[row][col] == 0 || visited[row][col]){
            return;
        }


        visited[row][col] = true;
        arr[row][col] =  0;

        dfs(row+1,col,arr);
        dfs(row,col+1,arr);
        dfs(row-1,col,arr);
        dfs(row,col-1,arr);

        visited[row][col] = false;
    }
}