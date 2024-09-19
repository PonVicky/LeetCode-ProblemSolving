import java.util.Hashtable;
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Hashtable<String,Integer> map = new Hashtable<>();
        List<String> list = new ArrayList<>();
        mapping(map,s1);
        mapping(map,s2);
        for(Map.Entry<String,Integer> iter : map.entrySet()){
            if(iter.getValue() == 1){
                list.add(iter.getKey());
            }
        }
        String[] out = new String[list.size()];
        out = list.toArray(out);

        return out;
    }
    public static void mapping(Hashtable<String,Integer> map, String str){
        String word  = "";
        str+=" ";
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                word+=ch;
            }else{
                if(map.containsKey(word)){
                    map.put(word,map.get(word)+1);
                }else{
                    map.put(word,1);
                }
                word  = "";
            }
        }
    }
}