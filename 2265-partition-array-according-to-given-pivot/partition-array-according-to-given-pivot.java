class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        List<Integer> max = new ArrayList<>(), equal = new ArrayList<>(), min = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(nums[i] > pivot) max.add(nums[i]);
            else if(nums[i] == pivot) equal.add(nums[i]);
            else min.add(nums[i]);
        }
        int j =0;
        for(int i=0;i<min.size();i++) nums[j++] = min.get(i);
        for(int i=0;i<equal.size();i++) nums[j++] = equal.get(i);
        for(int i=0;i<max.size();i++) nums[j++] = max.get(i);

        return nums;
    }
}