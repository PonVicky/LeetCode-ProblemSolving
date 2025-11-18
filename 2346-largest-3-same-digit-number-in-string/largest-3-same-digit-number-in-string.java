class Solution {
    public String largestGoodInteger(String num) {
               int n = num.length();
        char last = num.charAt(0);
        int count = 1;
        char max  = ' ';
        for(int i=1;i<n;i++){
            char ch = num.charAt(i);
            if(last == ch){
                count++;
            }else if(last!=ch){
                count = 1;
                last = ch;
            }
            if(count  == 3 && (max < ch)){
                max = ch;
            }
        }
        if(max == ' ') return "";
        return ""+max+max+max;
    }
}