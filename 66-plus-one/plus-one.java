class Solution {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(digits[len-1] == 9 ){
            digits[len-1] = 0;
            int flag  = 1;
            for(int i=len-2;i>=0;i--){
                if(digits[i] == 9){
                    digits[i] = 0;
                    flag++;
                }else{
                    digits[i]+=1;
                    break;
                }
            }
            if(flag == len){
                int[] arr2 = new int[len+1];
                arr2[0] = 1;
                return arr2;
            }
        }else{
            digits[len-1]+=1;
        }

        return digits;
    }
}