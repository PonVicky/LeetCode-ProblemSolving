class Solution {
    public int[][] merge(int[][] intervals) {
        int n = intervals.length;
        if(n == 1) return intervals;
        List<int[]> list = new ArrayList<>();
        Arrays.sort(intervals,(a,b) -> a[0]-b[0]);
        for(int i=0;i<n;i++){
            int currStart = intervals[i][0];
            int currEnd = intervals[i][1];
            while(i < n-1 && currEnd >= intervals[i+1][0]){
                if(intervals[i+1][1] > currEnd)
                    currEnd = intervals[i+1][1];
                i++;
            }
            list.add(new int[]{currStart,currEnd});
        }
        n = list.size();
        int[][] out = new int[n][2];
        for(int i=0;i<n;i++){
            out[i] = list.get(i);
        }

        return out;
        
    }
} 