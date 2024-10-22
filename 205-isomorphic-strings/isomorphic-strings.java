class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> mapST = new HashMap<>();
        HashMap<Character,Character> mapTS =  new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ss = s.charAt(i),tt=t.charAt(i);
            if((mapST.containsKey(ss) && mapST.get(ss)!=tt)||
            (mapTS.containsKey(tt) && mapTS.get(tt)!=ss )){
                return false;
            }

            mapST.put(ss,tt);
            mapTS.put(tt,ss);
        }

    return true;

    }
}