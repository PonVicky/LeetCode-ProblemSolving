class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        int len = words.length;
        for(int i=0;i<len;i++){
            for(int j=0;j<len;j++){
                if(words[i].length() > words[j].length()){
                    if(words[i].contains(words[j])){
                     if(list.contains(words[j])){
                        continue;
                     }else{
                        list.add(words[j]);

                     }
                    }
                }
            }
        }

        return list;
    }
}