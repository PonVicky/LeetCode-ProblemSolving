import java.math.BigInteger;
class Solution {
    public String multiply(String num1, String num2) {
        if(num1.startsWith("0") || num2.startsWith("0")){
            return "0";
        }
        BigInteger n1 = new BigInteger("0");
        BigInteger n2 = new BigInteger("0");
        BigInteger ten = new BigInteger("10");
        for(char num : num1.toCharArray()){
            n1 = n1.multiply(ten).add(BigInteger.valueOf(num-'0'));
        }
        for(char num : num2.toCharArray()){
            n2 = n2.multiply(ten).add(BigInteger.valueOf(num-'0'));
        }

        return ((n1.multiply(n2))+"");
    }
}