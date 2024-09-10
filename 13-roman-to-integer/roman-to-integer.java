class Solution {
    public int romanToInt(String s) {
        Map<Character,Integer> map = new HashMap<>();
        map.put('I',1);
        map.put('V',5);
        map.put('X',10);
        map.put('L',50);
        map.put('C',100);
        map.put('D',500);
        map.put('M',1000);
        int number  = 0;
        int len = s.length();

        if(len  == 1){
            return map.get(s.charAt(0));
        }

        if(len  == 2){
            if(map.get(s.charAt(0))<map.get(s.charAt(1))){
                number+=(map.get(s.charAt(1)) - map.get(s.charAt(0)));
                return number; 
            }
        }

        for(int i=len-1;i>=1;i--){
            char ch  = s.charAt(i);
            char chNext = s.charAt(i-1);
            if(map.get(chNext) < map.get(ch)){
                number+=(map.get(ch)-map.get(chNext));
                i--;
            }else{
                number+=(map.get(ch));
            }
        }
        if(map.get(s.charAt(0)) >= map.get(s.charAt(1))) number+=map.get(s.charAt(0));

        return number;
    }
}