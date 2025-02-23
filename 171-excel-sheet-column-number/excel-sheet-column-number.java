class Solution {
    public int titleToNumber(String columnTitle) {
    
        int p= 0 , num = 0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            double pow = Math.pow(26,p++);
            num+=pow*(columnTitle.charAt(i)-'A'+1);
        }

        return num;
    }
}