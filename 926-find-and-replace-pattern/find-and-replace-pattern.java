class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> list = new ArrayList<>();
        if(pattern.length() == 1){
            for(String str: words){
                list.add(str);
            }
        }else{  
        for(String str:words){
             if(iso(str,pattern)){
                 list.add(str);
                }
            }
        }

        return list;
    }
    private static boolean iso(String s, String t){
        HashMap<Character,Character> mapST = new HashMap<>();
        HashMap<Character,Character> mapTS = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char ss = s.charAt(i), tt= t.charAt(i);

            if((mapST.containsKey(ss) && mapST.get(ss)!=tt) || 
            (mapTS.containsKey(tt) && mapTS.get(tt)!=ss) ){
                return false;
            }

            mapST.put(ss,tt);
            mapTS.put(tt,ss);
        }

        return true;
    }
}