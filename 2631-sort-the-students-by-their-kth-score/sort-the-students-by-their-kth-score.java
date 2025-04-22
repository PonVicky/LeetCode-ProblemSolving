class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int n = score.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(score[j][k] < score[j+1][k]) swap(j,j+1,score);
            }
        }
        return score;
    }   
    public static void swap(int i, int j,int[][] arr){
        for(int k=0;k<arr[0].length;k++){
            int temp = arr[i][k];
            arr[i][k] = arr[j][k];
            arr[j][k] = temp;
        }
    }
}