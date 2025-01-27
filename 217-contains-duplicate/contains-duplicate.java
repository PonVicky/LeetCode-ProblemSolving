class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> list = new HashSet<>();
        for(int i:nums){
            if(list.contains(i)){
                return true;
            }
            list.add(i);
        }

        return false;
    }
}