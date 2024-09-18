class Solution {
    public int prefixCount(String[] words, String pref) {
        int count = 0, len  = pref.length();
        for(String str : words){
            if(str.charAt(0) ==  pref.charAt(0)){
                    int temp  = 0;
                if(str.length()>=len){
                    for(int i=0;i<len;i++){
                        if(str.charAt(i) == pref.charAt(i)) temp++;
                    }
                }
                    if(temp == len)count++;
            }
        }
        return count;
    }
}