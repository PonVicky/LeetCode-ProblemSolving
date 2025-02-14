class Solution {
    public boolean halvesAreAlike(String s) {
        String vow = "aeiouAEIOU";
        int n = s.length();
        int first = 0, second = n/2;
        int count  = 0;
        while(second < n){
            char ch1 = s.charAt(first++);
            char ch2 = s.charAt(second++);

            if(vow.contains(ch1+"")){
                count++;
            }
            if(vow.contains(ch2+"")){
                count--;
            }
        }
            return count == 0 ? true : false;
    }
}