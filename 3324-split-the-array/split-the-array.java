class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i], map.getOrDefault(nums[i] , 0) + 1);
        }
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(mp.getValue() > 2) return false;
        }

        return true;
    }
}