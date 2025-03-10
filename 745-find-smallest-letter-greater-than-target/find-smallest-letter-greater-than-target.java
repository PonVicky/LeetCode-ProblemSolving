class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int ind = 0;
        int low  = 0, high = letters.length-1;
        while(low <= high){
            int mid = low + (high - low)/2;
            if(letters[mid] > target){
                ind = mid;
                high = mid -1;
            }else low = mid +1;
        }
        return letters[ind];
    }
}