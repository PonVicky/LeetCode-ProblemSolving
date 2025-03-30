class Solution {
    public int sum(int num1, int num2) {
        //USING BIT MANIPULATION
        while(num2 != 0){
            int temp = num1;
            num1 = num1 ^ num2;
            num2 = (temp & num2) << 1;
        }
        return num1;
    }
}