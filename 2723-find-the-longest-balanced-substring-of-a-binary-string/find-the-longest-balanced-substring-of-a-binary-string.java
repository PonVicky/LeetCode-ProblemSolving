class Solution {
    public int findTheLongestBalancedSubstring(String s) {
        int n = s.length();
        int max  = 0;
        for(int i=0;i<n;i++){
            int[] arr= new int[2];
            int[] index = new int[2];
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);
                if(ch == '0'){
                    index[0] = j;
                    arr[0]++;
                }else if(ch == '1'){
                    index[1] = j;
                    arr[1]++;
                }

                if(index[0] > index[1] && arr[0]!=0 && arr[1]!=0 ) break;

                if(arr[0] == arr[1]) max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}