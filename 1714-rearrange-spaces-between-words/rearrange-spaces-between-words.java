class Solution {
    public String reorderSpaces(String text) {
        int n = 0;
        String word = "";
        List<String> list = new ArrayList<>();
        int words = 0, spaces = 0;
        for(char ch : text.toCharArray()){
            if(ch == ' '){
                spaces++;
                if(!word.isEmpty()){
                    list.add(word);
                    word = "";
                    words++;
                }
            }else{
                word+=ch;
            }
        }
        if(!word.isEmpty()){
            words++;
            list.add(word);
            word = "";
        }
        n = list.size();
        int add = spaces;
        int end = spaces;
        if(words!=1){
            add = spaces / (words - 1);
            end = spaces % (words  -1);
        }
        StringBuilder out = new StringBuilder();
        for(int i=0;i<n;i++){
            out.append(list.get(i));
            if(i == n-1) continue;
            for(int j=0;j<add;j++){
                out.append(' ');
            }
        }

        if(end > 0 ){
            for(int i=0;i<end;i++) out.append(' ');
        }

        return out.toString();
        
    }
}