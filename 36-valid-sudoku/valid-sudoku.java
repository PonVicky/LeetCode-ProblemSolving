class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                char ch = board[i][j];
                if(ch != '.'){
                if(checkRow(board,i,j,ch) == false || checkCol(board,j,i,ch) == false || checkMatrix(board,i,j,ch) == false){
                    return false;
                }
                }
            }
        }
        return true;
    }

    private static boolean checkMatrix(char[][] arr, int i, int j, char ch){
        int rowStart = (i/3) * 3;
        int colStart = (j/3) * 3;
        int count  = 0;
        for(i=rowStart;i<rowStart + 3;i++){
            for(j=colStart;j<colStart + 3;j++){
                if(arr[i][j] == ch) count++;
            }
        }
        if(count > 1) return false;
        return true;
    }

    private static boolean checkRow(char[][] arr, int i, int ind, char ch){
        for(int j=0;j<9;j++){
            if(arr[i][j] == ch && j != ind){
                return false;
            }
        }
        return true;
    }

    private static boolean checkCol(char[][] arr, int j, int ind, char ch){
        for(int i=0;i<9;i++){
            if(arr[i][j] == ch && i!=ind){
                return false;
            }
        }
            return true;
    }
}