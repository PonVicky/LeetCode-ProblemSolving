class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int bikes  = 0;
        int sum  = 0;
        Arrays.sort(people);
        int l  = 0,  r = people.length-1;
        while(l <= r){
            sum=people[l]+people[r];
            if(sum <= limit){
                l++;r--;
                bikes++;
            }else{
                r--;
                bikes++;
            }
        }
        return bikes;
    }
}