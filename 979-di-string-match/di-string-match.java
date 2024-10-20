class Solution {
    public int[] diStringMatch(String s) {
        int n = s.length();
        int[] arr = new int[n+1];
        int i = 0;
        int d = n;
        int iter = 0;
        for(int k=0;k<n;k++){
            char ch = s.charAt(k);
            if(ch == 'I'){
                arr[iter++] = i++;
            }else{
                arr[iter++] = d--;
            }
        }
        if(s.endsWith("I")){
            arr[iter] = i;
        }else{
            arr[iter] = d;
            
        }

        return arr;
    }
}