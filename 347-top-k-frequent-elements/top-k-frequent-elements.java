class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        HashMap<Integer,List<Integer>> frequencyMap = new HashMap<>();
        for(Map.Entry<Integer,Integer> mp : map.entrySet()){
            if(frequencyMap.containsKey(mp.getValue())){
                frequencyMap.get(mp.getValue()).add(mp.getKey());
            }else{
                frequencyMap.put(mp.getValue(),new ArrayList<>(Arrays.asList(mp.getKey())));
            }
        }
        int flag = 0;
        int[] out = new int[k];
        for(int i=n;i>=0;i--){
            if(frequencyMap.containsKey(i)){
                for(int j=0;j<frequencyMap.get(i).size();j++){
                    out[flag++] = frequencyMap.get(i).get(j);
                    if(flag == k) return out;
                }
            }
        }
        return out;
    }
}