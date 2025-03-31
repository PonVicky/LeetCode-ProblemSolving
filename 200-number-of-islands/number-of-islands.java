class Solution {
    public int numIslands(char[][] grid) {
        int numberOfIslands = 0;
        int n  = grid.length;
        int m = grid[0].length;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(grid[i][j] == '1'){
                    searchIslands(i,j,grid,n,m);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }
    public static void searchIslands(int row, int col, char[][] arr,int n, int m){
        if(row < 0 || row >=n || col < 0 || col >= m||
            arr[row][col] != '1'){
                return;
        }
        arr[row][col] = '0';
        searchIslands(row+1,col,arr,n,m);
        searchIslands(row-1,col,arr,n,m);
        searchIslands(row,col+1,arr,n,m);
        searchIslands(row,col-1,arr,n,m);
    }
}