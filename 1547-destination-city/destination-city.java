import java.util.Hashtable;     
class Solution {
    public String destCity(List<List<String>> paths) {
        Hashtable<String,String> map = new Hashtable<>();
        int len = paths.size();
        String out  ="";
        for(int i=0;i<len;i++){
            map.put(paths.get(i).get(0),paths.get(i).get(1));
        }
        for(int i=0;i<len;i++){
            if(!map.containsKey(paths.get(i).get(1))){
                out+=paths.get(i).get(1);
            }
        }

        return out;
    }
}