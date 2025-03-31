class Solution {
    public int numIslands(char[][] grid) {
        int numberOfIslands = 0;
    
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == '1'){
                    searchIslands(i,j,grid);
                    numberOfIslands++;
                }
            }
        }
        return numberOfIslands;
    }
    public static void searchIslands(int row, int col, char[][] arr){
        if(row < 0 || row >=arr.length|| col < 0 || col >= arr[0].length||
            arr[row][col] != '1'){
                return;
        }
        arr[row][col] = '0';
        searchIslands(row+1,col,arr);
        searchIslands(row-1,col,arr);
        searchIslands(row,col+1,arr);
        searchIslands(row,col-1,arr);
    }
}