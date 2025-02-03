class Solution {
    public boolean isIsomorphic(String s, String t) {
        int i  =0 ;
        HashMap<Character,Character> hash1 = new HashMap<>();
        HashMap<Character,Character> hash2 = new HashMap<>();
        while(i < s.length()){
            char ch1 =  s.charAt(i);
            char ch2 = t.charAt(i);
            if((hash1.containsKey(ch1)) || (hash2.containsKey(ch2))){
                if((hash1.getOrDefault(ch1,'A') != ch2) || (hash2.getOrDefault(ch2,'A')!=ch1)){
                    return false;
                }
            }
            hash1.put(ch1,ch2);
            hash2.put(ch2,ch1);
            i++;   
        }

        return true;
    }
}