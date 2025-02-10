class Solution {
    public int maxDistance(int[] colors) {
        int n = colors.length;
        if(n==1) return 1;
        if(colors[0] != colors[n-1]) return n-1;
        int max  = -1;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(colors[i] != colors[j]){
                    max = Math.max(max,j-i);
                }
            }
        }
        return max;
    }
}