class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int n = s.length();
        int[] diff = new int[n];
        for(int i=0;i<n;i++){
            diff[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        //Sliding window
        int len = 0;
        int i =0 , j = 0;
        int sum = 0;
        while(j < n){
            sum+=diff[j];
            while(sum > maxCost){
                sum-=diff[i];
                i++;
            }
            len = Math.max(len,j-i+1);
            j++;
        }
        return len;
    }
}