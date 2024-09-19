import java.util.Hashtable;
class Solution {
    public int countWords(String[] words1, String[] words2) {
        Hashtable<String,Integer> map1 = new Hashtable<>();
        Hashtable<String,Integer> map2 = new Hashtable<>();

        for(String str : words1){
            if(map1.containsKey(str)) 
                map1.put(str,map1.get(str)+1);
            else
                map1.put(str,1);
        }
        int count  = 0;
        for(String str : words2){
            if(map1.containsKey(str)){
                if(map2.containsKey(str)){
                    map2.put(str,map2.get(str)+1);
                }else{
                    map2.put(str,1);
                }
            }
        }
        for(Map.Entry<String,Integer> iterator :  map2.entrySet()){
            if(iterator.getValue() == 1 && map1.get(iterator.getKey()) == 1){
                count++;
            }
        }


        return count;
    }
}