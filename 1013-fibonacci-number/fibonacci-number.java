class Solution {
    public int fib(int n) {
        if(n == 0) return 0;
     int prev = 1, prev2 = 0;
     for(int i=2;i<=n;i++){
        int curr = prev+prev2;
        prev2 = prev;
        prev = curr;
     }
     return prev;
    }
}