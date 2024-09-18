class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> out = new ArrayList<>();
        int len = nums.length;
        int[] hash = new int[len+1];
        for(int i:nums){
            hash[i]++;
        }
        for(int i=1;i<=len;i++){
            if(hash[i] == 0){
                out.add(i);
            }
        }
        return out;
    }
}