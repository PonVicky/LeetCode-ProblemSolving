class Solution {
    public int countBattleships(char[][] board) {
        int ships  = 0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] == 'X'){
                    ships++;
                    countBattleShips(i,j,board);
                }
            }
        }
        return ships;
    }
    public static void countBattleShips(int row, int col, char[][] arr){
        if(row < 0 || row >= arr.length ||
        col < 0 || col >=arr[0].length||
        arr[row][col] !='X') return;

        arr[row][col] = '.';
        countBattleShips(row+1,col,arr);
        countBattleShips(row-1,col,arr);
        countBattleShips(row,col+1,arr);
        countBattleShips(row,col-1,arr);
    }
}