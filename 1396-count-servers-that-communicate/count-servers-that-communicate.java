class Solution {
    public int countServers(int[][] grid) {
        int totalServers = 0;
        int disconnectedServers = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j] == 1){
                    totalServers++;
                    if(checkRowAndCol(i,j,grid)) disconnectedServers++;
                }
            }
        }        
        return totalServers - disconnectedServers;
    }
    public static boolean checkRowAndCol(int i, int j, int[][] arr){
        for(int k=0;k<arr[0].length;k++){
            if(arr[i][k] == 1 && j!=k) return false;
        }
        for(int k=0;k<arr.length;k++){
            if(arr[k][j] == 1 && i!=k) return false;
        }
        return true;
    }
}