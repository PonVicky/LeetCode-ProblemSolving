class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i =0;
        for(i=0;i<nums1.length;i++){
            map.put(nums1[i][0],nums1[i][1]);
        }
        for(i=0;i<nums2.length;i++){
            int chk = nums2[i][0];
            if(map.containsKey(chk)){
                map.put(chk,map.get(chk)+nums2[i][1]);
            }else{
                map.put(chk,nums2[i][1]);
            }
        }
        int n = map.size();
        int[][] arr = new int[n][2];
        i = 0;
        for(Map.Entry<Integer,Integer> mpp : map.entrySet()){
            arr[i][0] = mpp.getKey();
            arr[i][1] = mpp.getValue();
            i++;
        }
        Arrays.sort(arr,(a,b)->a[0] - b[0]);
        return arr;
    }
}