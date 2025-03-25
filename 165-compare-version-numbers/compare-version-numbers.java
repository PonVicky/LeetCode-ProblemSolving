class Solution {
    public int compareVersion(String version1, String version2) {
        int n = version1.length(), m = version2.length();
        int p1 = 0, p2 = 0;
        while(p1 < n || p2 < m){
            int num1 = 0, num2  =0;
            while(p1 < n && version1.charAt(p1) != '.'){
                num1 = num1 * 10 + (int)version1.charAt(p1) - 48;
                p1++;
            }
            while(p2 < m && version2.charAt(p2) != '.'){
                num2 = num2 * 10 + (int)version2.charAt(p2) - 48;
                p2++;
            }
            if(num1 > num2) return 1;
            else if(num2 > num1) return -1;
            p1++;p2++;
        }

        return 0;
    }
}