class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> out = new ArrayList<>();
        combinations(0,target,candidates,new ArrayList<>(),out);
        return out;
    }
    public static void combinations(int i, int target, int[] arr, List<Integer> list, List<List<Integer>> out){
        if(i == arr.length){
            if(target  ==0) out.add(new ArrayList<>(list));
        return;
        }
        if(arr[i] <= target){
            list.add(arr[i]);
            combinations(i,target-arr[i],arr,list,out);
            list.removeLast(); 
        }
            combinations(i+1,target,arr,list,out);

    }
    
}