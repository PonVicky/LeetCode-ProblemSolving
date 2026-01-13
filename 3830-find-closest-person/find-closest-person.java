class Solution {
    public int findClosest(int x, int y, int z) {
        int xDistance  = Math.abs(z-x);
        int yDistance = Math.abs(z-y);
        if(xDistance == yDistance) return 0;
        if(xDistance < yDistance) return 1;

        return 2;
    }
}