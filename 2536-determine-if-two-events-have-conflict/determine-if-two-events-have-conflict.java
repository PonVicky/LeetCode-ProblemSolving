class Solution {
    public boolean haveConflict(String[] event1, String[] event2) {
        int start  = 0, end  = 0, start2= 0, end2 = 0;
        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                char ch = event1[i].charAt(j);
                if(ch!=':'){
                    if(i == 0)
                        start = (start * 10) +(ch-'0');
                    else
                        end = (end * 10) + (ch - '0');
                }
            }
        }

        for(int i=0;i<2;i++){
            for(int j=0;j<5;j++){
                char ch = event2[i].charAt(j);
                if(ch!=':'){
                    if(i == 0)
                        start2 = (start2 * 10) +(ch-'0');
                    else
                        end2 = (end2 * 10) + (ch - '0');
                }
            }
        }

        if((start2 >= start && start2<=end) || (end2>=start && end2<=end)){
            return true;
        }else if((start>=start2 && start<=end2) || (end >= start2 && end <= end2)){
            return true;
        }

        return false;
    }
}