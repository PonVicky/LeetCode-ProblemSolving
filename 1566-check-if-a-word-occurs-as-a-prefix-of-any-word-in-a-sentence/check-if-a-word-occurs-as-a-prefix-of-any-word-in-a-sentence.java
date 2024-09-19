class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
        sentence+=" ";
        int count  = 0, flag = 0;
        String word = "";
        for(int i=0;i<sentence.length();i++){
            char ch = sentence.charAt(i);
            if(ch!=' '){
                word+=ch;
            }else{
                count++;
                if(word.startsWith(searchWord)){
                    flag = 1;
                    break;
                }
                word = "";
            }
        }
        if(flag == 1){
            return count;
        }

        return -1;
    }
}