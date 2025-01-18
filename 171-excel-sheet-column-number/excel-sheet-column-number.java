class Solution {
    public int titleToNumber(String columnTitle) {
        HashMap<Character,Integer> map = new HashMap<>();
        char ch = 'A';
        for(int i=1;i<=26;i++){
            map.put(ch++,i);
        }
        int p= 0 , num = 0;
        for(int i=columnTitle.length()-1;i>=0;i--){
            double pow = Math.pow(26,p++);
            num+=pow*map.get(columnTitle.charAt(i));
        }

        return num;
    }
}