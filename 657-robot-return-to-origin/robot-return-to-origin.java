class Solution {
    public boolean judgeCircle(String moves) {
        int oriX = 0, oriY = 0;
        int x  = 0, y = 0;
            for(char ch : moves.toCharArray()){
        switch (ch){
            case 'U':y--;
            break;
            case 'D':y++;
                break;
            case 'L':x--;
                break;
            case 'R':x++;
                break;
        }
            }
        if(oriX==x && oriY==y) return true;

        return false;
    
    }
}