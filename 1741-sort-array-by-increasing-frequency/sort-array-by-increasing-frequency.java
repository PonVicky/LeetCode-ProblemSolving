class Solution {
    public int[] frequencySort(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        HashMap<Integer,List<Integer>>freq = new HashMap<>();
        for(int i:nums) map.put(i,map.getOrDefault(i,0)+1);
        for(Map.Entry<Integer,Integer> m : map.entrySet()){
            if(freq.containsKey(m.getValue())){
                freq.get(m.getValue()).add(m.getKey());
            }else{
                freq.put(m.getValue(),new ArrayList<>(Arrays.asList(m.getKey())));
            }
        }
        int[] temp = new int[n+1];
        for(int i=0;i<=n;i++){
            if(freq.containsKey(i)){
                temp[i] = freq.get(i).size();
            }
        }
        int k  = 0;
       for(int i=0;i<n;i++){
           if(temp[i] != 0 && freq.get(i).size() == 1){
               for(int j=0;j<i;j++){
                   nums[k++] = freq.get(i).get(0);
               }
           }else if(temp[i] != 0 && freq.get(i).size() > 1){
               freq.get(i).sort((a,b) -> b - a);
               for(int l  = 0;l <freq.get(i).size();l ++) {
                   for (int j = 0; j < i; j++) {
                       nums[k++] = freq.get(i).get(l);
                   }
               }
           }
       }
       return nums;
    }
}