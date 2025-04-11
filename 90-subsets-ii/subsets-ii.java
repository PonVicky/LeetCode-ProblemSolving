class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
    List<List<Integer>> list = new ArrayList<>();
    Arrays.sort(nums);
    subsets(0,nums,new ArrayList<>(),list);
    return list;
    }
    public static void subsets(int ind, int[] arr, List<Integer> list, List<List<Integer>> out){
        out.add(new ArrayList<>(list));
        for(int i=ind;i<arr.length;i++){
            if(i > ind && arr[i] == arr[i-1]) continue;
            list.add(arr[i]);
            subsets(i+1,arr,list,out);
            list.remove(list.size()-1);
        }
    }
}