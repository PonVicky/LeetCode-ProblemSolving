class Solution {
    public String largestOddNumber(String num) {
        int n = num.length();
        int answer  = 0;
        for(int i=n-1;i>=0;i--){
            int theNumber = num.charAt(i)-'0';
            if( theNumber % 2 == 1){
                answer = i+1;
                break;
            }
        }        
        return num.substring(0,answer);
    }
}