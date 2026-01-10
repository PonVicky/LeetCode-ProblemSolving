class Solution {
    public int addDigits(int num) {
        if(num < 10) return num;
        while(num >= 10){
            num = reduce(num);
        }

        return num;
    }       

    public static int reduce(int n){
        int num  = 0 ;
        while(n > 0){
            num = num  + (n%10);
            n/=10;
        }
        return num;
    }
}