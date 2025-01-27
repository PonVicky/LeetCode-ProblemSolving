class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int f=-1,s = -1;
        for(int i=0;i<nums.length;i++){
            int check = target - nums[i];
            if(map.containsKey(check)){
                f = map.get(check);
                s = i;
                break;
            }
            map.put(nums[i],i); 
        }
    return new int[] {f,s};
    }
}