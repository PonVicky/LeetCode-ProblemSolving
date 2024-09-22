class Solution {
    public int maxPower(String s) {
        int max = -1,count  = 0;
        int len = s.length();
        if(len == 1){
            return 1;
        }
        for(int i=0;i<len-1;i++){
            char ch = s.charAt(i);
            count++;
            if(ch == s.charAt(i+1)){
                for(int j=i+1;j<len;j++){
                    if(s.charAt(j) != ch){
                        break;
                    }
                    i++;
                    count++;
                }
            }
            if(count>  max){
                max = count;
            }
            count = 0;
        }

        return max;
    }
}