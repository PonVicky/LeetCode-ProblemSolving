class Solution {
    public List<String> validStrings(int n) {
        List<String> list = new ArrayList<>();
        generateBinaryStrings(n,"",list);
        return list;
    }
     public static void generateBinaryStrings(int n, String str,List<String> list){
        if(str.length() == n) {
            list.add(str);
            return;
        }
        int len = str.length();
        if (len == 0 || str.charAt(len-1) != '0')
        generateBinaryStrings(n,str+"0",list);
        generateBinaryStrings(n,str+"1",list);
    }
}