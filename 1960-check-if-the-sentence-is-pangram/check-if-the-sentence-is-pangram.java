class Solution {
    public boolean checkIfPangram(String sentence) {
        int len = sentence.length();
        if(len<26) return false;
        int[] mapArray = new int[26];
        for(int i=0;i<len;i++){
            char ch = sentence.charAt(i);
            mapArray[ch-'a'] = 1;
        }
        for(int i=0;i<26;i++){
            if(mapArray[i] == 0){
                return false;
            }
        }
        return true;
    }
}