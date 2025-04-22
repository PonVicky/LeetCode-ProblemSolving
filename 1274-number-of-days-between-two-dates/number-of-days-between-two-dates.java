class Solution {
    public int daysBetweenDates(String date1, String date2) {
        int[] months = {31,28,31,30,31,30,31,31,30,31,30,31};
        int y1=0,y2=0,m1=0,m2=0,d1=0,d2=0;
        int count  = 0;
        StringBuilder capture1 =  new StringBuilder(), capture2 = new StringBuilder();
        for(int i=0;i<date1.length();i++){
            char ch1 = date1.charAt(i), ch2 = date2.charAt(i);
            if(ch1!='-'){
                capture1.append(ch1);
                capture2.append(ch2);
            }else{
                count++;
                if(count  == 1){
                    y1 = Integer.parseInt(capture1.toString());
                    y2 = Integer.parseInt(capture2.toString());
                }else{
                    m1 = Integer.parseInt(capture1.toString());
                    m2 = Integer.parseInt(capture2.toString());
                }
                int len = capture1.length();
                capture1.delete(0,len);
                capture2.delete(0,len);
            }
        }
        d1 = Integer.parseInt(capture1.toString()); d2 = Integer.parseInt(capture2.toString());

        return Math.abs(getDays(d1,m1,y1,months) - getDays(d2,m2,y2,months));
    }

    public static int getDays(int day, int month, int year, int[] months){
        int days = 0;
        for(int y=1970;y<year;y++){
            days+= checkLeap(y) ? 366 : 365;
        }

        for(int m=0;m<month-1;m++){
            days+=months[m];
            if(m == 1 && checkLeap(year)) days++;
        }

        return days+day;
    }

    public static boolean checkLeap(int year){
        if(year%400 == 0) return true;
        else if(year%100 == 0) return false;
        else if(year%4 == 0) return true;
        else return false;
    }
}