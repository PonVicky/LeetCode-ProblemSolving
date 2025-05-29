class Solution {
    public int numberOfSubstrings(String s) {
        int count  = 0;
        int i = 0;
        int n = s.length();
        int[] hash  = {-1,-1,-1};
        while(i < n){
            char ch = s.charAt(i);
            hash[ch-'a'] = i;
            if(hash[0]!=-1 && hash[1]!=-1 && hash[2]!=-1){
                count+=Math.min(hash[0],Math.min(hash[1],hash[2]))+1;
            }
            i++;
        }
        return count;
    }
}