class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        quickSort(0,names.length-1,heights,names);
        return names;
    }
    public static void quickSort(int i, int j, int[] arr, String[] str){
        if(i >= j) return;
        int partitionIndex = getPivot(i,j,arr,str);
        quickSort(i,partitionIndex-1,arr,str);
        quickSort(partitionIndex+1,j,arr,str);
    }
    public static int getPivot(int low, int high, int[] arr, String[] str){
        int i = low, j = high;
        int pivot = arr[low];
        while( i < j ){
            while(arr[i] >= pivot && i < high) i++;
            while(arr[j] < pivot && j > low) j--;
            if(i < j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

                String t = str[i];
                str[i] = str[j];
                str[j] = t;
            }
        }
        int temp = arr[j];
        arr[j] = arr[low];
        arr[low] = temp;

        String t  = str[j];
        str[j] = str[low];
        str[low] = t;

        return j;
    }
}