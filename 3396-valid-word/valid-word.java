class Solution {
    public boolean isValid(String word) {
        int n = word.length();
        if(n < 3) return false;
        if(!checkAll(word)) return false;
        if(!checkCons(word)) return false;
        if(!checkVowel(word)) return false;
        return true;
    }
 public static boolean checkAll(String str){
        for(char ch:str.toCharArray()){
            if(!(Character.isDigit(ch) || Character.isAlphabetic(ch))){
                return false;
            }
        }
        return true;
    }
    public static boolean checkVowel(String str){
        for(char ch : str.toCharArray()){
            if(ch == 'a' || ch=='A' ||
            ch=='e' || ch =='E' || ch == 'I' || ch =='i'
            ||ch =='o' ||ch =='O' || ch=='u' ||ch =='U'){
                return true;
            }
        }
        return false;
    }
    public static boolean checkCons(String str){
        for(char ch  : str.toCharArray()){
            if((ch != 'A' && ch !='E' && ch!='I' && ch!='O' && ch!='U'&&
                    ch != 'a' && ch!='e' && ch !='i' && ch!='o' && ch!='u' && !Character.isDigit(ch))){
                return true;
            }
        }
        return false;
    }
}