class Solution {
    public int countPrefixes(String[] words, String s) {
        int count  = 0;
        for(String str :  words){
            if(str.charAt(0) == s.charAt(0)){
                int len = str.length();
                if(len <= s.length()){
                int flag = 1;
                for(int i=0;i<str.length();i++){
                    if(str.charAt(i) !=  s.charAt(i)){
                        flag =0;
                        break;
                    }
                }
                if(flag == 1) count++;
                }
            }
        }

        return count;
    }
}