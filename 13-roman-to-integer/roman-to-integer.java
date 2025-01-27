class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int n = s.length();
        if(n == 1) return map.get(s.charAt(0));
        int sum = 0;
        for(int i=0;i<n;i++){
            char c = s.charAt(i);
            if(i+1 < n && map.get(c) < map.get(s.charAt(i+1))){
                sum+=map.get(s.charAt(i+1)) - map.get(c);
                i++;
            }else sum+=map.get(c);
        }

        return sum;

    }
}