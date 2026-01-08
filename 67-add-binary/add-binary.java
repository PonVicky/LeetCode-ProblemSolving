class Solution {
    public String addBinary(String a, String b) {
        int i  =  a.length()-1, j=b.length()-1;
        StringBuilder output = new StringBuilder();
        int carry = 0;
        while(i >= 0 || j >= 0){
            int num1  = i >= 0 ? a.charAt(i) -'0' : 0;
            int num2  = j >= 0 ? b.charAt(j) -'0' : 0;
            int sum = num1 + num2 + carry;
            if(sum == 2){
                output.append("0");
                carry = 1;
            }else if(sum == 3){
                output.append("1");
                carry = 1;
            }else{
                output.append(sum);
                carry = 0;
            }
            i--;j--; 
        }

        if(carry != 0){
            output.append("1");
        }

        return output.reverse().toString();
    }
}