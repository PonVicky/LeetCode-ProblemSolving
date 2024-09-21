class Solution {
    public String[] findWords(String[] words) {
        List<String> list = new ArrayList<>();
        String row1 = "qwertyuiopQWERTYUIOP";
        String row2 = "asdfghjklASDFGHJKL";
        String row3 = "zxcvbnmZXCVBNM";

        for(String str :  words){
            if(contain(str,row1)){
                list.add(str);
            }else if(contain(str,row2)){
                list.add(str);
            }else if(contain(str,row3)){
                list.add(str);
            }
        }

        String[] out = new String[list.size()];
        out = list.toArray(out);

        return out;

    }
    private static boolean contain(String str, String row){
        for(char ch: str.toCharArray()){
            if(!row.contains(ch+"")){
                return false;
            }
        }
        return true;
    }
}