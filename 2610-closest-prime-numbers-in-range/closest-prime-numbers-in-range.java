class Solution {
    public int[] closestPrimes(int left, int right) {
            int[] arr = new int[right+1];
            int i=0;
            for(i=2;i*i<=right;i++){
                if(arr[i] == 0){
                    for(int j=i*i;j<=right;j+=i) arr[j] = 1;
                }
            }
            int min = Integer.MAX_VALUE;
            if(left==1) left++;
            int start = -1;
            int end = -1;
            for( i=left;i<right;i++){
                if(arr[i] == 0){
                    for(int j=i+1;j<=right;j++){
                        if(arr[j] == 0){
                            if(j-i+1 < min){
                                min = j-i+1;
                                start = i;
                                end = j;
                            }
                            i=j-1;
                            break;
                        }
                    }
                }
            }
        return new int[] {start,end};
    }
}