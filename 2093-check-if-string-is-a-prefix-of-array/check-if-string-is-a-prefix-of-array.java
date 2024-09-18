class Solution {
    public boolean isPrefixString(String s, String[] words) {
        String out  = "";
        for(String str : words){
            out+=str;
          
            if(!s.startsWith(out)){
                return false;                
            }
            if(out.equals(s) ){
                break;
            }
        }
        if(out.length() != s.length()) return false;
        return true;
    }
}