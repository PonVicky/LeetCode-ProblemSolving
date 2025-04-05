class Solution {
    public int maxAreaOfIsland(int[][] grid) {
        int[] counter = {0};
        int maxArea  = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    searchIslands(i,j,counter,grid);
                }
                    maxArea = Math.max(maxArea,counter[0]);
                    counter[0] = 0;
            }
        }
        return maxArea;
    }
    public static void searchIslands(int row, int col, int[] counter, int[][] arr){
        if(row <  0 || row >=arr.length ||
        col < 0 || col >= arr[0].length ||
        arr[row][col] != 1) return;

        counter[0] = counter[0] + 1;
        arr[row][col] = 0;
        searchIslands(row+1, col, counter, arr);
        searchIslands(row-1, col, counter, arr);
        searchIslands(row, col+1, counter, arr);
        searchIslands(row, col-1, counter, arr);
    }
}