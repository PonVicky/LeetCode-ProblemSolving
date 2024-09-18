class Solution {
    public static String rev(String str){
        StringBuilder out = new StringBuilder(str);
        return out.reverse().toString();
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int count  = 0;
        int len = words.length;
        for(int i=0;i<len;i++){
            for(int j=i+1;j<len;j++){
                if(words[i].equals(rev(words[j]))){
                    count++;
                }
            }
        }
        return count;
    }
}