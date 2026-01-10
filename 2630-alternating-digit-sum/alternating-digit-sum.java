class Solution {
    public int alternateDigitSum(int n) {
        String str  = ""+n;
        int sign  = 1;
        n = str.length();
        int sum  =0 ;
        for(int i=0;i<n;i++){
            sum =  sum  + ((str.charAt(i)-'0') * sign);
            sign = -sign;
        }
        return sum;
    }
}