class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> list = new ArrayList<>();
        validCombinations(1,n,k,new ArrayList<>(),list);
        return list;
    }
    public static void validCombinations(int i, int target, int k, List<Integer> list, List<List<Integer>> out){
        if(list.size() == k || target <= 0){
            if(list.size() == k && target == 0){
                out.add(new ArrayList<>(list));
            }
            return;
        }
        for(int j=i;j<=9;j++){
            if(j > target) break;
            list.add(j);
            validCombinations(j+1,target-j,k,list,out);
            list.remove(list.size() - 1);
        }
    } 
}