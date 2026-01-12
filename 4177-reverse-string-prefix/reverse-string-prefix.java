class Solution {
    public String reversePrefix(String s, int k) {
        if(k == 1) return s;
        StringBuilder str = new StringBuilder();
        for(int i=k-1;i>=0;i--){
            str.append(s.charAt(i));
        }
        for(int i=k;i<s.length();i++){
            str.append(s.charAt(i));
        }

        return str.toString();
    }
}