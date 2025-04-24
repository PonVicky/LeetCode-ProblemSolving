class Solution {
    public int[] sortArray(int[] nums) {
        mergeSort(0,nums.length-1,nums);
        return nums;
    }
 public static void mergeSort(int low, int high,int[] arr){
        if(low == high) return;
        int mid = low + (high-low)/2;
        mergeSort(low, mid,arr);
        mergeSort(mid+1,high, arr);
        merge(low,high,mid,arr);
    }
    public static void merge(int low, int high,int mid, int[] arr){
        List<Integer> list = new ArrayList<>();
        int left  = low, right = mid+1;
        while(left <= mid && right <= high){
            if(arr[left] <= arr[right]){
                list.add(arr[left]);
                left++;
            }else{
                list.add(arr[right]);
                right++;
            }
        }
        while(left <= mid) list.add(arr[left++]);
        while(right <= high) list.add(arr[right++]);
        int k = 0;
        for(int i=low;i<=high;i++){
            arr[i] = list.get(k++);
        }
    }
}