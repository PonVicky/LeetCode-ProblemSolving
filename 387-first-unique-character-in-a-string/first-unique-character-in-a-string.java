import java.util.Hashtable;


class Solution {
    public int firstUniqChar(String s) {
        Hashtable<Character,Integer> map = new Hashtable<>();

        int len = s.length();
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
     
        for(int i=0;i<len;i++){
            char ch = s.charAt(i);
            if(map.get(ch) == 1){
                return i;
            }
        }
        return -1;
    }
}