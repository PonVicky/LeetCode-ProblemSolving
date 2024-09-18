import java.util.Hashtable;
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        if(len == 1) return list;

        Hashtable<Integer,Integer>  map = new Hashtable<>();
        for(int i=0;i<len;i++){
            if(map.containsKey(nums[i])){
                map.put(nums[i],map.get(nums[i])+1);
            }else{
                map.put(nums[i],1);
            }
        }

        for(int i :  map.keySet()){
            if(map.get(i) == 2){
                list.add(i);
            }
        }
        Collections.sort(list);
        return list;
    }
}