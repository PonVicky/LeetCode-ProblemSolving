class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = order.length, m = friends.length;
        int[] out = new int[m];
        int outIndex  = 0;
        int[] hash = new int[n+1];
        for(int i=0;i<m;i++){
            hash[friends[i]] = 1;
        }
        for(int i=0;i<n;i++){
            if(hash[order[i]] != 0){
                out[outIndex] = order[i];
                outIndex++;
            }
        }

        return out;
    }
}