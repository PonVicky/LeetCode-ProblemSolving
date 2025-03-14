class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        List<int[]> list = new ArrayList<>();
        int n = mat.length;
        int m = mat[0].length;
        for(int i=0;i<n;i++){
            list.add(new int[] {i,binarySearch(mat[i],m)});
        }
        list.sort((a,b) -> a[1] - b[1]);
        int[] out = new int[k];
        for(int i=0;i<k;i++){
            out[i] = list.get(i)[0];
        }
        return out;
    }
    public static int binarySearch(int[] arr, int n){
        int ind = n;
        int low = 0, high = n-1;
        while(low <= high){
            int mid  = low + (high -low)/2;
            if(arr[mid] == 1) low = mid +1;
            else{
                ind = mid ;
                high = mid -1;
            } 
        }
        return ind;
    }
}