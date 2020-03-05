/*
 * @lc app=leetcode.cn id=1 lang=java
 *
 * [1] 两数之和
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> hashMap = new HashMap<>();

        for(int i = 0;i < nums.length;i++){
            int diff = target - nums[i];
            if(hashMap.containsKey(diff)){
                return new int[]{hashMap.get(diff),i};
            }
            hashMap.put(nums[i],i);
        }
        return new int[2];
    }
}
// @lc code=end

