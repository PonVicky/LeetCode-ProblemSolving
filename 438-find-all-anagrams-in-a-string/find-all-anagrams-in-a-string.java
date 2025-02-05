class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> list = new ArrayList<>();
        int n = p.length();
        int m  = s.length();
        int[] hash = new int[26];
        for(int i=0;i<n;i++) hash[p.charAt(i)-'a']++;
        
        for(int i=0;i<m;i++){
            char ch = s.charAt(i);
            if(hash[ch-'a'] > 0){
                int[] temp  = Arrays.copyOf(hash,26);
                int count  = 0;
                int j = i;
                while(temp[s.charAt(j)-'a'] > 0){
                    count++;
                    temp[s.charAt(j)-'a']--;
                    j++;
                    if(j >= m)break;
                }
                if(count == n) list.add(i);
            }
        }
    return list;
    }
   
}