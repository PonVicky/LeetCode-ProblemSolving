class Solution {
    public boolean wordPattern(String pattern, String s) {
     int n = pattern.length();
     String[] arr = s.split(" ");
     if(n != arr.length) return false;
    HashMap<Character,String> map = new HashMap<>();
    for(int i=0;i<n;i++){
        char ch = pattern.charAt(i);
        if(map.containsKey(ch)){
            if(!arr[i].equals(map.get(ch))){
                return false;
            }
        }else{
        if(map.containsValue(arr[i])) return false;
        map.put(ch,arr[i]);
        
        }
    }   

    return true;

    }
}