class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int min = k;
        int count  = 0;
        int j =0;
        for(int i=0;i<n;i++){
            if(blocks.charAt(i) == 'W') count++;
            if(i-j+1 == k){
                min = Math.min(min,count);
                if(blocks.charAt(j) == 'W') count--;
                j++;
            }
        }

        return min;
    }
}