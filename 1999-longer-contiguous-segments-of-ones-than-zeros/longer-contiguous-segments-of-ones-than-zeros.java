class Solution {
    public boolean checkZeroOnes(String s) {
         int one = counter(s,1);
         int zero = counter(s,0);

         if(zero < one){
            return true;
         }

         return false;
    }
    private static int counter(String str, int n){
            int max = -1, count = 0;
            for(int i=0;i<str.length();i++){
                int num = str.charAt(i)-'0';
                if(n == num){
                    count++;
                }else{
                    if(count> max){
                        max = count;
                    }
                    count  = 0;
                }
            }
            if(count > max){
                max = count;
            }

            return max;
    }
}