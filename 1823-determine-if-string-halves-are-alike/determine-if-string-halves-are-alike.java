class Solution {
    public boolean halvesAreAlike(String s) {
        HashSet<Character> vow = new HashSet<>();
        vow.add('a');
        vow.add('e');
        vow.add('i');
        vow.add('o');
        vow.add('u');
        vow.add('A');
        vow.add('E');
        vow.add('I');
        vow.add('O');
        vow.add('U');

        int n = s.length();
        int first = 0, second = n/2;
        int count  = 0;
        while(second < n){
            char ch1 = s.charAt(first++);
            char ch2 = s.charAt(second++);

            if(vow.contains(ch1)){
                count++;
            }
            if(vow.contains(ch2)){
                count--;
            }
        }
            return count == 0;
    }
}