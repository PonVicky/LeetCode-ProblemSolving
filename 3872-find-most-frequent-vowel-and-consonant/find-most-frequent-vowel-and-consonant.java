class Solution {
    public int maxFreqSum(String s) {
        int maxV = 0, maxC = 0;
        int[] hash = new int[26];
        for(int i=0;i<s.length();i++){
            hash[s.charAt(i) -'a']++;
        }
        for(int i=0;i<26;i++){
             char ch = (char) (i + 'a');
             if(ch == 'a' || ch == 'e' || ch=='i' || ch == 'o' || ch=='u'){
                maxV = Math.max(maxV , hash[i]);
             }else{
                maxC = Math.max(maxC , hash[i]);
             }
        }
        return maxC + maxV;
    }
}