class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count  = 0;
        String vow = "aeiou";
        for(int i=left;i<=right;i++){
            if(vow.contains(words[i].charAt(0)+"") && vow.contains(words[i].charAt(words[i].length()-1)+"")){
                count++;
            }
        }

        return count;
    }
}