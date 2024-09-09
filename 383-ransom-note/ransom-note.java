class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        int len1 = ransomNote.length(), len2 = magazine.length();
        int[] arr1 = new int[26], arr2 = new int[26];
        for(int i=0;i<len1;i++) arr1[ransomNote.charAt(i)-'a']++;
        for(int i=0;i<len2;i++) arr2[magazine.charAt(i)-'a']++;

        for(int i=0;i<len1;i++){
            if(arr1[ransomNote.charAt(i)-'a'] > arr2[ransomNote.charAt(i)-'a'])   
                return false;
            
        }
        return true;
        }
}