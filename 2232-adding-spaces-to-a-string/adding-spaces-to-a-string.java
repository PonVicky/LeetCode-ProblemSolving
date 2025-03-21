class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder str = new StringBuilder();
        int j  = 0;
        for(int i=0;i<spaces.length;i++){
            str.append(s.substring(j,spaces[i])+" ");
            j  = spaces[i];
        }
        str.append(s.substring(j,s.length()));
        return str.toString();
    }
}