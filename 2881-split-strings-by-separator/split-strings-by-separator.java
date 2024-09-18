class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> list = new ArrayList<>();
        for(String str :  words){
            addString(list,str,separator);
        }
        return list;
    }
    public static void addString(List<String> list, String str, char sep){
       String word = "";
       str+=sep;
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch!=sep){
                word+=ch;
            }else{
                if(!word.isBlank()){
                    list.add(word);
                    word ="";
                }
            }
        }
    }
}