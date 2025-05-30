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
        if(str.length() == 0)
        generateBinaryStrings(n,str+"0",list);
        else if (str.charAt(str.length()-1) != '0')
        generateBinaryStrings(n,str+"0",list);
        generateBinaryStrings(n,str+"1",list);
    }
}