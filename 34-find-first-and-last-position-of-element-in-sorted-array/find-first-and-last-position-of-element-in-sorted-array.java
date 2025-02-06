class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = firstPosition(nums,target);
        int[] arr = new int[2];
        if(first  == -1){
            arr[0] = -1;arr[1] = -1;
            return arr;
        }
        arr[0] = first;
        arr[1] = lastPosition(nums,target);

        return arr;
    }

    public static int lastPosition(int[] arr, int x){
        int index  = -1;
        int low = 0 , high = arr.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(arr[mid] == x){
                index = mid;
                low = mid +1;
            }else if(arr[mid] > x){
                high = mid-1;
            }else low = mid +1;
        }
        return index;
    }

    public static int firstPosition(int[] arr, int x){
        int index  = -1;
        int low =0, high = arr.length-1;
        while(low <= high){
            int mid = low + (high-low)/2;
            if(arr[mid] == x ){
                index = mid;
                high = mid -1;
            }else if(arr[mid] > x){
                high = mid -1;
            }else low = mid +1;
        }
        return index;
    }


}