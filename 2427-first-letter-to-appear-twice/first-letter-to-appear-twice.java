class Solution {
    public char repeatedCharacter(String s) {
        int[] hash = new int[26];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(hash[ch-'a']!=0) return ch;
            hash[ch-'a']++;
        }

        return 'f';
    }
}