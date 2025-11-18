class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder out = new StringBuilder();
        int addable  = 0;
        for(char ch : s.toCharArray()){
            if(ch == '('){
                if(addable != 0) out.append(ch);
                addable++;
            }else{
                addable--;
                if(addable != 0 ) out.append(ch);
            }
        }       
        return out.toString();
    }
}