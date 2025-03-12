class Solution {
    public int maximumCount(int[] nums) {
        int n = nums.length;
        int negative = binarySearch(nums,n,true);
        int positive =n-  binarySearch(nums,n,false);
        return Math.max(positive,negative);
    }

    public static int binarySearch(int[] arr, int n, boolean choice){
        int ind  = n;
        int low = 0, high = n-1;
        if(choice){
            //LOWER BOUND: TO FIND THE LAST NEGATIVE NUMBER
            while(low <= high){
                int mid = low + (high -low)/2;
                if(arr[mid] >= 0){
                    ind = mid;
                    high = mid-1;
                }else low = mid +1;
            }
        }else{
            //UPPER BOUND: TO FIND THE FIRST POSTIVE NUMBER
                while(low <= high){
                int mid = low + (high -low)/2;
                if(arr[mid] > 0){
                    ind = mid;
                    high = mid-1;
                }else low = mid +1;
            }
        }
        return ind;
    }

}