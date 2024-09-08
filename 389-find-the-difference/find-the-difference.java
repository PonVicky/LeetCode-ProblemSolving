class Solution {
    public char findTheDifference(String s, String t) {
        int len = s.length();
        if(s.length() == 0) return t.charAt(0);
        int[] hashArray = new int[26]; // depicts 26 alphabets of English
        for(int i=0;i<len;i++){
            hashArray[s.charAt(i)-'a']+=1;
            hashArray[t.charAt(i)-'a']+=1;
        }
        hashArray[t.charAt(len)-'a']+=1;
        char out  = 0;
        for(int i=0;i<26;i++){
            if(hashArray[i]%2==1){
                out =(char)(i+'a');
            }
        }
        return out;
    }
}