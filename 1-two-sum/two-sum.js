/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    let n = nums.length;
    const hashmap = new Map();
    for(let i=0;i<n;i++){
        let check = target  - nums[i];
        if(hashmap.has(check)){
            return [hashmap.get(check) , i];
        }
        hashmap.set(nums[i] , i);
    }

    return [-1,-1];
};