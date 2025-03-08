class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n = blocks.length();
        int left  = 0, right = k-1;
        int count  = 0;
        int minColors = 200;
        while(right < n){
            for(int i=left;i<=right;i++){
                if(blocks.charAt(i) == 'W') count++;
            }
            minColors = Math.min(count,minColors);
            count = 0;
            left++;right++;
        }

        return minColors;
    }
}