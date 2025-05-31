class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> out = new ArrayList<>();
        generateSubsets(0,nums,new ArrayList<>(),out);
        return out;
    }
   public static void generateSubsets(int i, int[] arr, List<Integer> list, List<List<Integer>> out){
    if(i == arr.length){
        out.add(new ArrayList<>(list));
        return;
    }
    list.add(arr[i]);
    generateSubsets(i+1,arr,list,out);
    list.removeLast();
    generateSubsets(i+1,arr,list,out);
   }

}