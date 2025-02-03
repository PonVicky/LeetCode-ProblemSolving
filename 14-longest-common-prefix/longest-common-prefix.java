class Solution {
    public String longestCommonPrefix(String[] strs) {
        int min = Integer.MAX_VALUE,ind = 0;
        for(int i=0;i<strs.length;i++){
            int size = strs[i].length();
            if(size < min){
                min = size;
                ind = i;
            }
        }

        String compare  = strs[ind];
        int i =0;
        while(i < min){
            for(String str : strs){
                if(str.charAt(i) != compare.charAt(i)){
                    return compare.substring(0,i);
                }
            }
            i++;
        }
        
        return compare;
    }
}