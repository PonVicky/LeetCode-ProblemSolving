class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j] != '.'){
                    if(!check3X3Matrix(i,j,board[i][j],board) ||
                    !checkCol(j,board,board[i][j],i) ||
                    !checkRow(i,board,board[i][j],j)) return false;
                }
             

            }
        }
        return true;

    }

    public static boolean check3X3Matrix(int i, int j, char target,char[][] board){
        int count  = 0;
        int rowStart = (i/3) *3;
        int colStart = (j/3) * 3;
        for(i=rowStart;i<rowStart+3;i++){
            for(j=colStart;j<colStart+3;j++){
                if(board[i][j] == target) count++;
            }
        }

        return count == 1;

     } 


    public static boolean checkRow(int i,char[][] board,char target, int ignore){
        for(int j=0;j<board[0].length;j++){
            if(board[i][j] == target && j!=ignore){
                return false;
            }
        }
        return true;
    }

    public static boolean checkCol(int j,char[][] board, char target, int ignore){
        for(int i=0;i<board.length;i++){
            if(board[i][j] == target && i!=ignore){
                return false;
            }
        }
        return true;
    }
}