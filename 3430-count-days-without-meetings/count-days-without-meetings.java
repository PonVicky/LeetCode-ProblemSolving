class Solution {
    public int countDays(int days, int[][] meetings) {
        int n = meetings.length;
        if(n == 1){
            days-=(meetings[0][1] - meetings[0][0] + 1);
            return days;
        }
        //Sorting
        Arrays.sort(meetings,(a,b) -> a[0]-b[0]);
        List<int[]> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            int currStart = meetings[i][0];
            int currEnd = meetings[i][1];
            while(i < n-1 && currEnd >= meetings[i+1][0]){
                if(currEnd < meetings[i+1][1]) currEnd = meetings[i+1][1];
                i++;
            }
            list.add(new int[]{currStart,currEnd});
        }
        for(int i=0;i<list.size();i++){
            days-=(list.get(i)[1] - list.get(i)[0] + 1);
        }
        return days;
    }
}