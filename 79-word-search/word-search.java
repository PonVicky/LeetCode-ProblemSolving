class Solution {
    static boolean[][] visited;
    public boolean exist(char[][] board, String word) {
        visited  = new boolean[board.length][board[0].length];
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(word.charAt(0) == board[i][j] && searchWordDFS(0,i,j,word,board)){
                    return true;
                }
            }
        }

        return false;    
    }
    public static boolean searchWordDFS(int i, int row, int col, String word, char[][] arr){
        if(i == word.length()) return true;

        if(row < 0 || row >=arr.length || col < 0 || col >= arr[0].length ||
            word.charAt(i) != arr[row][col] || visited[row][col] ) return false;

        visited[row][col] = true;
        
        if(searchWordDFS(i+1,row+1,col,word,arr) ||
        searchWordDFS(i+1,row-1,col,word,arr) ||
        searchWordDFS(i+1,row,col+1,word,arr) ||
        searchWordDFS(i+1,row,col-1,word,arr)){
            return true;
        }

        visited[row][col] = false;
        return false;

    }
    
}