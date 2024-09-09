class Solution {
    public char repeatedCharacter(String s) {
        int len = s.length();
        if(len == 2){
            return s.charAt(0);
        }
        
        int[] arr = new int[26];
        char out  = ' ';
        
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(arr[ch-'a']==1){
                out = ch;
                break;
            }
            arr[ch-'a']++;
        }
        return out;
    }
}