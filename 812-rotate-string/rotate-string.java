class Solution {
    public boolean rotateString(String s, String goal) {
        int n = s.length();
        if(n!=goal.length()) return false;
        if(goal.equals(s)) return true;
        for(int i=0;i<n;i++){
            String rotate = s.substring(1,n)+s.substring(0,1);
            s = rotate;
            if(s.equals(goal)) return true;
        }

        return false;
    }
}