class Solution {
    public List<List<Integer>> mergeSimilarItems(int[][] items1, int[][] items2) {
        List<List<Integer>> list = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<items1.length;i++){
            map.put(items1[i][0],items1[i][1]);
        }
        for(int i=0;i<items2.length;i++){
            int chk = items2[i][0];
            if(map.containsKey(chk)) map.put(chk,map.get(chk)+items2[i][1]);
            else map.put(chk,items2[i][1]);
        }
        int n = map.size();
        for(Map.Entry<Integer,Integer> mpp : map.entrySet()){
            list.add(new ArrayList<>(List.of(mpp.getKey(),mpp.getValue())));
        }
        Collections.sort(list, (a,b) -> a.get(0) - b.get(0));
        return list;
    }
}