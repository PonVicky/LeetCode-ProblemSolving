class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        permutate(0,nums,list);
        return list;
    }
    public static void permutate(int i, int[] arr, List<List<Integer>> list){
        if(i == arr.length){
            List<Integer> temp = new ArrayList<>();
            for(int j:arr) temp.add(j);
            list.add(new ArrayList<>(temp));
            return;
        }
        for(int j=i;j<arr.length;j++){
            swap(arr,i,j);
            permutate(i+1,arr,list);
            swap(arr,i,j);
        }
    }
    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i]= arr[j];
        arr[j] = temp;
    }
}