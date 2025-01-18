class Solution {
    public boolean isSubsequence(String s, String t) {
        int n = s.length();
        if(n == 0) return true;
        int j = 0;
        for(int i=0;i<t.length();i++){
            if(t.charAt(i) == s.charAt(j)){
                j++;
            }
            if(j == n) return true;
        }

        
        return false;
    }
}