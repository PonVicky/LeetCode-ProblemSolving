class Solution {
    public int numIslands(char[][] grid) {
        //USING BERTH-FIRST SEARCH
        int islandCount  = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                if(grid[i][j] == '1'){
                    islandCount++;
                    startBFS(grid,i,j);
                }
            }
        }
        return islandCount;
    }

    private static void startBFS(char[][] grid,int i, int j){
            if(i < 0 || i >= grid.length || j < 0 || j >=grid[0].length
                || grid[i][j] == '0') return;

            grid[i][j] = '0';
            startBFS(grid,i,j+1);//right
            startBFS(grid,i,j-1);//left
            startBFS(grid,i+1,j);//top
            startBFS(grid,i-1,j);//bottom

    }
}