class Solution {
    public String largestOddNumber(String num) {
        int max   = -1;
        int n = num.length();
        if((num.charAt(n-1))%2==1) return num;
        for(int i=n-1;i>=0;i--){
            int digit = num.charAt(i)-'0';
            if(digit%2==1){
                max = Math.max(max,i);
            }
        }
        String str = num.substring(0,max+1);

        return str;
    }
}