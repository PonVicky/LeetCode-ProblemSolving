class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n  = s.length();
        int l = 0 , r= 0 ;
        int max = 0;
        int sum  = 0;
        while(r < n){
            sum+=Math.abs(s.charAt(r) - t.charAt(r));
            if(sum > maxCost){
                sum-=Math.abs(s.charAt(l) - t.charAt(l));
                l++;
            }
            max = Math.max(max,r-l+1);
            r++;
        }
        return max;
    }
}