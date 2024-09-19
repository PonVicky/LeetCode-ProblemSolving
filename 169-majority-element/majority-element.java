class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length/2;
        Map<Integer,Integer> map = new HashMap<>();
        for(int num : nums){
            if(map.containsKey(num)){
                map.put(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }
        int out  = 0;
        for(Map.Entry<Integer,Integer> iter : map.entrySet()){
            if(iter.getValue() > n){
                out = iter.getKey();
                break;
            }
        }
        return out;
    }
}