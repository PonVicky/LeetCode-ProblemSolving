class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int leftSum = 0, rightSum = 0;
        for(int i= 0;i<k;i++) leftSum+=cardPoints[i];
        int max = leftSum;
        int j = cardPoints.length-1;
        for(int i=k-1;i>=0;i--){
            leftSum-=cardPoints[i];
            rightSum+=cardPoints[j];
            j--;
            max = Math.max(leftSum+rightSum,max);
        }
        return max;
    }
}