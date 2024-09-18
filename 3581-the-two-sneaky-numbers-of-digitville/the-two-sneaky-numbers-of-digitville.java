class Solution {
    public int[] getSneakyNumbers(int[] nums) {
        int[] arr = new int[2];
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }
        int i= 0;
        for(Map.Entry<Integer,Integer> key : map.entrySet()){
            if(map.get(key.getKey()) == 2){
                arr[i++] = key.getKey();
            }
        }

        return arr;
    }
}