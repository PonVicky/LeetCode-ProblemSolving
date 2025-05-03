class Solution {
    public boolean isAcronym(List<String> words, String s) {
        int n = words.size();
        if(n!=s.length()) return false;
        int j=0;
        for(int i=0;i<n;i++){
            if(words.get(i).charAt(0) != s.charAt(j)) return false;
            j++;
        }
        return true;
    }
}