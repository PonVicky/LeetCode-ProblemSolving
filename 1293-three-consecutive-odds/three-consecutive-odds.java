class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int n = arr.length;
        if(n <=2) return false;
        for(int i=1;i<n-1;i++){
            if((arr[i-1]%2) + (arr[i]%2) + (arr[i+1]%2) == 3) return true;
        }

        return false;
    }
}