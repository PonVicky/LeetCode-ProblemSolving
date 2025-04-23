class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max  = 0;
        for(int i=1;i<=n;i++){
            int sum  = getSum(i);
            map.put(sum,map.getOrDefault(sum,0)+1);
            max = Math.max(max,map.get(sum));
        }
        int count  = 0;
        for(int i : map.values()){
            if(i == max) count++;
        }
        return count;
    }
    public static int getSum(int n){
        int sum  = 0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        return sum;
    }
}