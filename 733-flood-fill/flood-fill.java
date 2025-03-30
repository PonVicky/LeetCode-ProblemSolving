class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;

        fillIt(sr,sc,image[sr][sc],color,image);
        return image;
    }
    public static void fillIt(int row, int col,int curr, int change, int[][] arr) {
        if(row < 0 || row >= arr.length || col < 0 ||
        col >= arr[0].length || arr[row][col] != curr) return;

        arr[row][col]  = change;

        fillIt(row+1,col,curr,change,arr);
        fillIt(row-1,col,curr,change,arr);
        fillIt(row,col+1,curr,change,arr);
        fillIt(row,col-1,curr,change,arr);

    }
}