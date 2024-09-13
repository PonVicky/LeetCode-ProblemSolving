class Solution {
    public static boolean checkk(int[] arr, String str){
        for(int i=0;i<str.length();i++){
            if(arr[str.charAt(i)-'a'] == 0){
                return false;
            }
        }
        return true;
    }

    public int countConsistentStrings(String allowed, String[] words) {
        int count=0;
        int[] arr = new int[26];
        for(char ch : allowed.toCharArray()){
            arr[ch-'a'] = 1;
        }
        for(String str : words){
            if(checkk(arr,str)) count++;
        }
        return count;
    }
}