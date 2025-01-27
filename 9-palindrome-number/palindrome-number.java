class Solution {
    public boolean isPalindrome(int x) {
        int temp = x, out  = 0;
        while(temp > 0){
            out = (out*10) +(temp%10);
            temp/=10;
        }
        if(out==x) return true;

        return false;
    }
}