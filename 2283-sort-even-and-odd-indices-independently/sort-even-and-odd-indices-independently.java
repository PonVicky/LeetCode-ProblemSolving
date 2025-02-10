class Solution {
    public int[] sortEvenOdd(int[] nums) {
        int n = nums.length;
        if(n == 1) return nums;
        bubbleSort(nums,0,n);
        bubbleSort(nums,1,n);
        return nums;
    }
    public static void bubbleSort(int[] arr, int k, int n){
        for(int i=0;i<n;i++){
            for(int j=k;j<n;j+=2){
                if(k == 0){
                    if(j+2 < n && arr[j] > arr[j+2]){
                      swap(arr,j,j+2);
                    }
                }else if(k == 1){
                    if(j+2 < n && arr[j] < arr[j+2]){
                        swap(arr,j,j+2);
                    }
                }
            }
        }
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}