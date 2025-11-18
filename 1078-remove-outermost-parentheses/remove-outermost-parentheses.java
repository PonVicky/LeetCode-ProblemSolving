class Solution {
    public String removeOuterParentheses(String s) {
        int n = s.length();
        if(n == 1 || n== 0) return "";
        StringBuilder out = new StringBuilder();
        boolean isFirst = true;
        int addable  = 0;
        for(char ch : s.toCharArray()){
            if(ch == '(' && isFirst){
                isFirst = !isFirst;
                continue;
            }

            if(ch == ')' && addable == 0) isFirst  = true;
            else if(ch =='(') {
                addable++;
                out.append(ch);
            }else if(ch ==')' && addable!=0){
                addable--;
                out.append(ch);
            }
        }
        return out.toString();
    }
}