class Solution {
    public int finalPositionOfSnake(int n, List<String> commands) {
        int k = 0;
        int[][] arr = new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[i][j] = k++;
            }   
        }
        //STARTING POSITION
        int[] position = {0,0};
        for(int i=0;i<commands.size();i++){
            if(commands.get(i).equals("RIGHT")){
                position[1]++;
            }
            else if(commands.get(i).equals("LEFT")){
                position[1]--;
            }
            else if(commands.get(i).equals("DOWN")){
                position[0]++;
            }
            else if(commands.get(i).equals("UP")){
                position[0]--;
            }
        }

        return arr[position[0]] [position[1]];
    }
}