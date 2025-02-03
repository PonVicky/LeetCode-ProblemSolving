class Solution {
    public String reverseWords(String s) {
        String out  ="", word = "";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch != ' '){
                word+=ch;
            }else{
                if(!word.isEmpty()){
                    out = " "+word+out;
                }
                word = "";
            }
        }

        out = word+out;

        if(out.charAt(0) ==' '){
            out = out.substring(1,out.length());
        }

        return out;
    }
}