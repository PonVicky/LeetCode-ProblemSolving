class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> output = new ArrayList<>();
        int n = nums.length;
        int count  = 0;
        while(count < n){
            List<Integer> list = new ArrayList<>();
            for(int i=0;i<n;i++){
                if(nums[i] == -1) continue;
                if(!list.contains(nums[i])){
                    list.add(nums[i]);
                    nums[i] = -1;
                    count++;
                }
            }
            output.add(list);
        }

        return output;
    }
}