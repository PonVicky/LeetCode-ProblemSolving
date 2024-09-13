class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> out = new ArrayList<>();
        int max  = candies[0],len= candies.length;
        for(int i=1;i<len;i++){
            if(max<candies[i]) max = candies[i];
        }

        for(int i=0;i<len;i++){
            if(candies[i]+extraCandies < max) out.add(false);
            else out.add(true);
        }

        return out;
    }
}