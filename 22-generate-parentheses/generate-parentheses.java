class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> out = new ArrayList<>();
        generateIt(n,0,0,new StringBuilder(),out);
        return out;
    }
    public static void generateIt(int n, int open,int close, StringBuilder str, List<String> list){
        if(n ==  open &&  n == close){
            if(str.length() == n+n){
                list.add(str.toString());
            }
            return;
        }
        if(open <= n){
            str.append('(');
            generateIt(n,open+1,close,str,list);
            str.deleteCharAt(str.length()-1);
        }
        if(close < open){
            str.append(')');
            generateIt(n,open,close+1,str,list);
            str.deleteCharAt(str.length()-1);
        }
    }
}