class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length(), p1=0, p2=0, len =0;
        int[] hash = new int[256];
        // Arrays.fill(hash,-1);
        // while(p2<n){
        //     char ch = s.charAt(p2);
        //     if(hash[ch] != -1){
        //         if(hash[ch]>=p1) p1=hash[ch]+1;
        //     }
        //     len = Math.max(len,p2-p1+1);
        //     hash[ch] = p2;
        //     p2++;
        // }
        while(p2 < n){
            hash[s.charAt(p2)]++;
            while(hash[s.charAt(p2)] != 1){
                hash[s.charAt(p1)]--;
                p1++;
            }
            len = Math.max(len,p2-p1+1);
            p2++;
        }
        return len;

    }
}